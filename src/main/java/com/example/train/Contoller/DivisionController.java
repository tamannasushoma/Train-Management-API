package com.example.train.Contoller;

import com.example.train.DTO.GetDiv;
import com.example.train.Model.Division;
import com.example.train.Repository.DivisionRepository;
import com.example.train.Service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DivisionController {
    @Autowired
    private DivisionService divisionService;

    @PostMapping("/saveDivision")
    public Division saveDivision(@RequestBody Division division){
        return divisionService.saveDivisionInfo(division);
    }
//
//    @GetMapping("/getAllDivision")
//    public List<Division> findAllDivision(){
//        return divisionRepository.findAll();
//    }
}
