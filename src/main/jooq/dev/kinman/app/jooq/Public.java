/*
 * This file is generated by jOOQ.
 */
package dev.kinman.app.jooq;


import dev.kinman.app.jooq.tables.Databasechangeloglock;
import dev.kinman.app.jooq.tables.WeatherStations;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.databasechangeloglock</code>.
     */
    public final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>public.weather_stations</code>.
     */
    public final WeatherStations WEATHER_STATIONS = WeatherStations.WEATHER_STATIONS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Databasechangeloglock.DATABASECHANGELOGLOCK,
            WeatherStations.WEATHER_STATIONS
        );
    }
}
