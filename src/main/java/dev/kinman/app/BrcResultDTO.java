package dev.kinman.app;
import org.apache.commons.math3.util.Precision;

public record BrcResultDTO(String formattedOutput) {

    public BrcResultDTO(String station_name, double min_measurement
            , double mean_measurement, double max_measurement) {

        this(String.format("%s=%s/%s/%s",
                station_name,
                String.valueOf(Precision.round(min_measurement, 1)),
                String.valueOf(Precision.round(mean_measurement,1)),
                String.valueOf(Precision.round(max_measurement,1))));
    }
}
