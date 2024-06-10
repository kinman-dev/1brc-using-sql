package dev.kinman.app;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import static org.jooq.Records.mapping;

import static dev.kinman.app.jooq.tables.WeatherStations.WEATHER_STATIONS;
import static org.jooq.impl.DSL.*;

@Repository
public class WeatherStationsDAO {

    private final DSLContext dslContext;

    public WeatherStationsDAO(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

//    public List<WeatherStationsDTO> findAllByStationName(String stationName) {
//        var fetchRecord = dslContext.select(WEATHER_STATIONS.STATION_NAME,
//                WEATHER_STATIONS.MEASUREMENT)
//                .from(WEATHER_STATIONS)
//                .where(WEATHER_STATIONS.STATION_NAME.eq(stationName))
//                .fetch(mapping(WeatherStationsDTO::new));
//
//        return fetchRecord;
//    }

    public List<BrcResultDTO> getBrcResult(){
        var subquery = dslContext.select(
                        WEATHER_STATIONS.STATION_NAME,
                        min(WEATHER_STATIONS.MEASUREMENT).over(partitionBy(WEATHER_STATIONS.STATION_NAME)).as("min_measurement"),
                        avg(WEATHER_STATIONS.MEASUREMENT).over(partitionBy(WEATHER_STATIONS.STATION_NAME)).as("mean_measurement"),
                        max(WEATHER_STATIONS.MEASUREMENT).over(partitionBy(WEATHER_STATIONS.STATION_NAME)).as("max_measurement")
                )
                .from(WEATHER_STATIONS)
                .asTable("SUBQUERY");

        var result = dslContext.selectDistinct(
                        subquery.field("station_name"),
                        subquery.field("min_measurement"),
                        subquery.field("mean_measurement"),
                        subquery.field("max_measurement")
                )
                .from(subquery)
                .orderBy(field("STATION_NAME").asc())
                .fetch();

        return result.into(BrcResultDTO.class);


    }



}
