package com.example.train.Service;

import com.example.train.Model.BookingTable;
import com.example.train.Model.Train;
import com.example.train.Repository.BookingTableRepository;
import com.example.train.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingTableService implements BookingServiceInterface{
    @Autowired
    private BookingTableRepository bookingTableRepository;

    @Override
    public BookingTable SaveBookInfo(BookingTable book) {
        return bookingTableRepository.save(book);
    }

}
