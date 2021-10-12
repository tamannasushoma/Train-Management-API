package com.example.train.Service;

import com.example.train.Model.Division;
import com.example.train.Model.Train;
import com.example.train.Repository.DivisionRepository;
import com.example.train.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements DivisionServiceInterface {
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public Division saveDivisionInfo(Division division) {
        return  divisionRepository.save(division);
    }


}
