package com.example.train.Service;

import com.example.train.Model.District;
import com.example.train.Repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;


    public District saveDistrictInfo(District district) {
        return districtRepository.save(district);
    }

//    @Override
//    public Train findTrainInfo() {
//        return (Train) trainRepository.findAll();
//    }
}
