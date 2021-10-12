//package com.example.train.Contoller;
//
//import com.example.train.Model.MappingTable;
//import com.example.train.Model.Train;
//import com.example.train.Service.MappingTableService;
//import com.example.train.Service.TrainService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class MappingTableController {
//    @Autowired
//    private MappingTableService mappingTableService;
//    @PostMapping("/map")
//    public MappingTable createMap(@RequestBody MappingTable mappingTable) {
//
//        return  mappingTableService.saveMapInfo(mappingTable);
//    }
//
//    @GetMapping("/getmap")
//    public MappingTable findAllDivision(){
//
//        return mappingTableService.findMapInfo();
//    }
//}
