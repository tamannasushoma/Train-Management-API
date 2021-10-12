package com.example.train.Service;

import com.example.train.Model.Station;
import com.example.train.Repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService implements StationServiceInterface {
    @Autowired
    private StationRepository stationRepository;

    @Override
    public Station saveStationInfo(Station station) {
        return  stationRepository.save(station);
    }

//    @Override
//    public Station findStationInfo() {
//        return stationRepository.findAll();
//    }
}
