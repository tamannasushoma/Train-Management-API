package com.example.train.Repository;
import com.example.train.DTO.API3;
import com.example.train.Model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {
    @Query(value = "SELECT s.station_name as Station, d.district_name as District, d.district_id as Id, v.div_name as Division " +
            "FROM station_info s" +
            " INNER JOIN district d ON s.district_id = d.district_id " +
            " INNER JOIN division v ON d.div_id = v.division_id", nativeQuery = true)
    List<API3> getDistrictInformation();
}
