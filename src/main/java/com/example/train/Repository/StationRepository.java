package com.example.train.Repository;

import com.example.train.DTO.API1;
import com.example.train.DTO.JoinDiv;
import com.example.train.Model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
    @Query(value = "SELECT s.station_name as Station, t.train_name as Trains, s.division_name as Division, d.district_name as District " +
            "FROM train_info t INNER JOIN Train_station_mapping m ON t.train_id = m.train_id " +
            "INNER JOIN station_info s ON m.station_id = s.station_id " +
            "INNER JOIN district d ON s.district_id = d.district_id" +
            " ORDER BY Station" , nativeQuery = true)
    List<API1> getJoinedTable();
}
