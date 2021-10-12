package com.example.train.Service;

import com.example.train.Model.Train;
import com.example.train.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TrainService implements TrainServiceInterface {
    @Autowired
    private TrainRepository trainRepository;

    @Override
    public Train saveTrainInfo( Train train) {
        return trainRepository.save(train);
    }

    @Override
    public Train findTrainInfo() {
        return (Train) trainRepository.findAll();
    }
}
