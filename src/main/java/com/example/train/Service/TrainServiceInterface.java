package com.example.train.Service;

import com.example.train.Model.Train;

import java.util.List;

public interface TrainServiceInterface{
    public Train saveTrainInfo(Train train);

    public Train findTrainInfo();
}
