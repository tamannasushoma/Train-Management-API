package com.example.train.Contoller;

import com.example.train.Model.BookingTable;
import com.example.train.Model.Train;
import com.example.train.Repository.BookingTableRepository;
import com.example.train.Service.BookingTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookingController {
    @Autowired
    BookingTableService bookingTableService;

    @Autowired
    BookingTableRepository bookingTableRepository;

    @PostMapping("/booking")
    public BookingTable Book(@RequestBody BookingTable booking) {

        return  bookingTableService.SaveBookInfo(booking);
    }


}
