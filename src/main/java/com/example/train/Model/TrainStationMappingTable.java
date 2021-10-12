//package com.example.train.Model;
//import javax.persistence.*;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import java.util.*;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//
//@Entity
//@Table(name = "MappedTable")
//public class TrainStationMappingTable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "Train_ID")
//    private Train train;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "Station_ID")
//    private Station station;
//
//    @Column(name = "Date&Time")
//    @Temporal(TemporalType.DATE)
//    private Date DateAndTime = new Date();
//}
