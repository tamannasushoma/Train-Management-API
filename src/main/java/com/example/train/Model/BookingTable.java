package com.example.train.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.
        List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "BookingTable")
public class BookingTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long passengerID;

    @Column(name="Passenger_Name")
    private String PassengerName;

//    @Temporal(TemporalType.DATE)
    @Column(name= "Travel_Time_Date")
    private String TravelTimeDate;

    @Column(name="Train_Name")
    private String TrainName;

    @Column(name="station_Name")
    private String stationName;

    @Column(name="seat_no")
    private String seatNo;

//    @Column(name="destination")
//    private String destination;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="train_booking",
            joinColumns = @JoinColumn(
                    name= "booking_id",
                    referencedColumnName = "passengerID"),
            inverseJoinColumns = @JoinColumn(
                    name= "train_id",
                    referencedColumnName = "trainId"
            ))
    private List<Train> train = new ArrayList<>();

}
