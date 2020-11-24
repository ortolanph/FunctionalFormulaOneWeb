package pho.formulaone.web.persistence.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pho.formulaone.web.persistence.entities.RaceData;

import java.util.List;

@Service
public class RaceDataProxy {

    @Autowired
    private RaceDataRepository repository;

    private List<RaceData> allData;

    public List<RaceData> allData() {
        if(allData == null) {
            allData = repository.findAll();
        }

        return allData;
    }

}
