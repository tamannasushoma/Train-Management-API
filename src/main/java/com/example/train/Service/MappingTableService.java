//package com.example.train.Service;
//
//import com.example.train.Model.MappingTable;
//import com.example.train.Model.Train;
//import com.example.train.Repository.MappingTableRepository;
//import com.example.train.Repository.TrainRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MappingTableService implements MappingTableServiceInterface {
//    @Autowired
//    private MappingTableRepository mappingTableRepository;
//
//    @Override
//    public MappingTable saveMapInfo(MappingTable mappingTable) {
//        return mappingTableRepository.save(mappingTable);
//    }
//
//    @Override
//    public MappingTable findMapInfo() {
//        return (MappingTable) mappingTableRepository.findAll();
//    }
//}
