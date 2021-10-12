package com.example.train.Repository;

import com.example.train.Model.BookingTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingTableRepository extends JpaRepository<BookingTable, Long> {
}
