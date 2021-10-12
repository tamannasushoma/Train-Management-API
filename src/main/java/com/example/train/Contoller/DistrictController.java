package com.example.train.Contoller;

import com.example.train.DTO.API1;
import com.example.train.DTO.API3;
import com.example.train.Model.District;
import com.example.train.Model.Station;
import com.example.train.Repository.DistrictRepository;
import com.example.train.Service.DistrictService;
import com.example.train.Service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistrictController {
    @Autowired
    private DistrictService districtService;
    @Autowired
    private DistrictRepository districtRepository;
    @PostMapping("/district_post")
    public District createDistrict(@RequestBody District district) {

        return  districtService.saveDistrictInfo(district);
    }

    @GetMapping("/get_district_list")

    public List<API3> ThirdAPI(){

        return districtRepository.getDistrictInformation();
    }

}
