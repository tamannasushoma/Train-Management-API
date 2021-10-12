package com.example.train.Repository;
import com.example.train.DTO.API3;
import com.example.train.Model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {
    @Query(value = "SELECT s.station_name as Station, d.district_name as District, div.div_name as Division " +
            "FROM station_info s" +
            " INNER JOIN district d ON s.district_id = d.district_id " +
            " JOIN division div ON d.div_id = div.division_id", nativeQuery = true)
    List<API3> getDistrictInformation();
}
