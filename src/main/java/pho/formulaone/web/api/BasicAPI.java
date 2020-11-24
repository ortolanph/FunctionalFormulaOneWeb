package pho.formulaone.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pho.formulaone.web.controller.BasicService;

import java.util.List;

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

}
