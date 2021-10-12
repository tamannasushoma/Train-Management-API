package com.example.train.Contoller;

import com.example.train.DTO.API1;
import com.example.train.DTO.JoinDiv;
import com.example.train.Model.Station;
import com.example.train.Model.Train;
import com.example.train.Repository.StationRepository;
import com.example.train.Service.StationService;
import com.example.train.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {
    @Autowired
    private StationRepository stationRepository;
    @Autowired
    private StationService stationService;
    @PostMapping("/post_station")
    public Station createStation(@RequestBody Station station) {

        return  stationService.saveStationInfo(station);
    }

    @GetMapping("/get_station_info")

    public List<API1> SecondAPI(){

        return stationRepository.getJoinedTable();
    }

//    @GetMapping("/getAllTrain")
//    public Train findAllDivision(@RequestBody Station station){
//
//        return  stationService.findStationInfo(station);
//    }

}
