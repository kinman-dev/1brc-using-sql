/*
 * This file is generated by jOOQ.
 */
package dev.kinman.app.jooq.tables;


import dev.kinman.app.jooq.Public;
import dev.kinman.app.jooq.tables.records.WeatherStationsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WeatherStations extends TableImpl<WeatherStationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.weather_stations</code>
     */
    public static final WeatherStations WEATHER_STATIONS = new WeatherStations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WeatherStationsRecord> getRecordType() {
        return WeatherStationsRecord.class;
    }

    /**
     * The column <code>public.weather_stations.station_name</code>.
     */
    public final TableField<WeatherStationsRecord, String> STATION_NAME = createField(DSL.name("station_name"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.weather_stations.measurement</code>.
     */
    public final TableField<WeatherStationsRecord, Double> MEASUREMENT = createField(DSL.name("measurement"), SQLDataType.DOUBLE, this, "");

    private WeatherStations(Name alias, Table<WeatherStationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private WeatherStations(Name alias, Table<WeatherStationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.weather_stations</code> table reference
     */
    public WeatherStations(String alias) {
        this(DSL.name(alias), WEATHER_STATIONS);
    }

    /**
     * Create an aliased <code>public.weather_stations</code> table reference
     */
    public WeatherStations(Name alias) {
        this(alias, WEATHER_STATIONS);
    }

    /**
     * Create a <code>public.weather_stations</code> table reference
     */
    public WeatherStations() {
        this(DSL.name("weather_stations"), null);
    }

    public <O extends Record> WeatherStations(Table<O> child, ForeignKey<O, WeatherStationsRecord> key) {
        super(child, key, WEATHER_STATIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public WeatherStations as(String alias) {
        return new WeatherStations(DSL.name(alias), this);
    }

    @Override
    public WeatherStations as(Name alias) {
        return new WeatherStations(alias, this);
    }

    @Override
    public WeatherStations as(Table<?> alias) {
        return new WeatherStations(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public WeatherStations rename(String name) {
        return new WeatherStations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WeatherStations rename(Name name) {
        return new WeatherStations(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public WeatherStations rename(Table<?> name) {
        return new WeatherStations(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Double> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super Double, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super Double, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
