package pho.formulaone.web.api;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.controller.PositionsService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/positions")
public class PositionsAPI {

    private PositionsService positionsService;

    @GetMapping("/season/{season}/round/{round}/grid")
    public @ResponseBody
    List<RaceResult> grid(@Param("season") int season, @Param("round") int round) {
        return positionsService.grid(season, round);
    }

}
