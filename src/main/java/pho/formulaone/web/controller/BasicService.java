package pho.formulaone.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pho.formulaone.web.persistence.entities.RaceData;
import pho.formulaone.web.persistence.repositories.RaceDataProxy;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BasicService {

    @Autowired
    private RaceDataProxy proxy;

    public List<Integer> findAllSeasons() {
        List<RaceData> allData = proxy.allData();

        return allData
                .stream()
                .map(RaceData::getSeasonNumber)
                .distinct()
                .collect(Collectors.toList());
    }
}
