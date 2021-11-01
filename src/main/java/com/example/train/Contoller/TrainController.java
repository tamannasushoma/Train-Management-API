package com.example.train.Contoller;
import com.example.train.DTO.EXDTO;
import com.example.train.DTO.JoinDiv;
import com.example.train.DTO.SearchTrain;
import com.example.train.Model.Train;
import com.example.train.Repository.TrainRepository;
import com.example.train.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class TrainController {
    
//    @Autowired
//    private TrainRepository trainRepository;
//
//    @PostMapping("/saveTrain")
//    public Train saveTrain(@RequestBody TrainDTO trainDTO){
//        return trainRepository.save(trainDTO.getTrain());
//    }
    @Autowired
    TrainRepository trainRepository;
    @Autowired
    private TrainService trainService;

    @PostMapping("/post_train")
    public Train createTrain(@RequestBody Train train) {

        return  trainService.saveTrainInfo(train);
    }

    @GetMapping("/get_train_info")

    public List<JoinDiv> SecondAPI(){

        return trainRepository.getJoinInformation();
    }

    @GetMapping("/train/{train_name}")

    public List<SearchTrain> FourthAPI(@PathVariable(value="train_name") String name){

        return trainRepository.searchByTrainName(name);
    }


}

