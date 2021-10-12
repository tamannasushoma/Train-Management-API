package com.example.train.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "TrainInfo")
public class Train {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trainId;

    @Column(name="train_name")
    private String trainName;

    @Column(name="seat_no")
    private String seatNo;

    @Column(name="destination")
    private String destination;

//    STATION OBJECT LIST,MANY-TO-MANY RELATIONSHIP WITH TRAIN
    @ManyToMany(targetEntity = Station.class, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Train_station_mapping",
            joinColumns = @JoinColumn(name = "train_id"),
            inverseJoinColumns = @JoinColumn(name="station_id")
    )
    private List<Station> station;

//    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
//    List<MappingTable> mappingTables;

//    BOOKING TABLE LIST HAS MANY-TO-MANY RELATIONSHIP WITH TRAIN

    @ManyToMany(mappedBy = "train")
    private List<BookingTable> bookingTables = new ArrayList<>();

}
