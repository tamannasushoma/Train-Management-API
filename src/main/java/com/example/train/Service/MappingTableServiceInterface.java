package com.example.train.Service;

import com.example.train.Model.MappingTable;
import com.example.train.Model.Train;

public interface MappingTableServiceInterface {
    public MappingTable saveMapInfo(MappingTable mappingTable);

    public MappingTable findMapInfo();
}
