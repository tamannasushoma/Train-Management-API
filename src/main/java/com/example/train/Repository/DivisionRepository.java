package com.example.train.Repository;
import com.example.train.Model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DivisionRepository extends JpaRepository<Division, Long> {
//   @Query(value = "SELECT d.district_name as districtName, p.div_name as divName FROM Division d JOIN d.district p")
//   public List<JoinDiv> getJoinInfo();
}
