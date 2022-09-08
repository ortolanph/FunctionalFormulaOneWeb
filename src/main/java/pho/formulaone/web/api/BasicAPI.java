package pho.formulaone.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pho.formulaone.web.service.BasicService;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/basics")
public class BasicAPI {

//    @Autowired
    private final BasicService basicService;

    @Autowired
    public BasicAPI(BasicService basicService) {
        this.basicService = basicService;
    }

    @GetMapping("/seasons")
    public @ResponseBody
    List<Integer> allSeasons() {
        return basicService.findAllSeasons();
    }

    @GetMapping("/totalraces")
    public @ResponseBody
    Integer totalRaces() {
        return basicService.totalRaces();
    }

    @GetMapping("/racesperseason")
    public @ResponseBody
    Map<Integer, Integer> racesPerSeason() {
        return basicService.racesPerSeason();
    }

    @GetMapping("/racersperseason")
    public @ResponseBody
    Map<Integer, Long> racersPerSeason() {
        return basicService.racersPerSeason();
    }

    @GetMapping("/constructorsperseason")
    public @ResponseBody
    Map<Integer, Long> constructorsPerSeason() {
        return basicService.constructorsPerSeason();
    }

}
