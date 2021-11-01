package com.example.train.Repository;
;
import com.example.train.DTO.JoinDiv;
import com.example.train.DTO.SearchTrain;
import com.example.train.Model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
    @Query(value = "SELECT t.train_id as trainId, t.train_name as trainName, t.seat_no as seatNo, s.station_name as destinationStation " +
            "FROM train_info t INNER JOIN Train_station_mapping m ON t.train_id = m.train_id " +
            "JOIN station_info s ON m.station_id = s.station_id", nativeQuery = true)
    List<JoinDiv> getJoinInformation();

//    @Query(value="SELECT t.train_name as trainName, t.seat_no as seatNo, t.destination as destinationRoute s.station as Stations " +
//            "FROM train_info t INNER JOIN train_station_mapping m ON t.train_id = m.train_id INNER JOIN station_info s ON m.station_id = s.station_id", nativeQuery = true)
//    List<EXDTO> getListedInformation();

    @Query(value = "SELECT t.train_name as trainName, t.seat_no as seatNo, s.station_name as destinationStation, d.district_name as District " +
            "FROM train_info t INNER JOIN Train_station_mapping m ON t.train_id = m.train_id " +
            "JOIN station_info s ON m.station_id = s.station_id " +
            "INNER JOIN district d ON s.district_id= d.district_id" +
            " WHERE t.train_name =:train", nativeQuery = true)
    List<SearchTrain> searchByTrainName(@Param("train") String train);


}



