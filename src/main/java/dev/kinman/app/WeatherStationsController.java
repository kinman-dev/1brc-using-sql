package dev.kinman.app;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/api")
@RestController
public class WeatherStationsController {

    private final WeatherStationsDAO weatherStationsDAO;

    public WeatherStationsController(WeatherStationsDAO weatherStationsDAO) {
        this.weatherStationsDAO = weatherStationsDAO;
    }

//    @GetMapping(value = "/{stationName}")
//    public @ResponseBody List<WeatherStationsDTO> findAllByStationName(@PathVariable(value="stationName") String stationName) {
//        List<WeatherStationsDTO> records = weatherStationsDAO.findAllByStationName(stationName);
//        return records;
//    }

    @GetMapping("/1brc")
    public @ResponseBody String getBrcResult() {
        return weatherStationsDAO.getBrcResult().stream()
                .map(BrcResultDTO::formattedOutput)
                .collect(Collectors.joining(", "));
    }
}
