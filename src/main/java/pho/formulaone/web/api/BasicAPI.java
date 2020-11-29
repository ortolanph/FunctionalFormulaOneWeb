package pho.formulaone.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pho.formulaone.web.controller.BasicService;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/basics")
public class BasicAPI {

    @Autowired
    private BasicService basicService;

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
