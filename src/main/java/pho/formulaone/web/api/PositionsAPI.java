package pho.formulaone.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.service.PositionService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/positions")
public class PositionsAPI {

    @Autowired
    private PositionService positionService;

    @GetMapping("/season/{season}/round/{round}/grid")
    public @ResponseBody
    List<RaceResult> grid(@PathVariable("season") Integer season, @PathVariable("round") Integer round) {
        return positionService.grid(season, round);
    }

    @GetMapping("/season/{season}/round/{round}/podium")
    public @ResponseBody
    List<RaceResult> podium(@PathVariable("season") Integer season, @PathVariable("round") Integer round) {
        return positionService.podium(season, round);
    }

    @GetMapping("/season/{season}/round/{round}/winner")
    public @ResponseBody
    RaceResult winner(@PathVariable("season") Integer season, @PathVariable("round") Integer round) {
        return positionService.winner(season, round);
    }

    @GetMapping("/season/{season}/round/{round}/poleposition")
    public @ResponseBody
    RaceResult poleposition(@PathVariable("season") Integer season, @PathVariable("round") Integer round) {
        return positionService.poleposition(season, round);
    }
}
