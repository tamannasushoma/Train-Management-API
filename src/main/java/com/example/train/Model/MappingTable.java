package com.example.train.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "MappingTable")
public class MappingTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long MapId;

    @Column(name= "train_id")
    private Long trainId;

    @Column(name= "station_id")
    private Long station;

    @Column(name = "DateTime")
    @Temporal(TemporalType.DATE)
    private Date DateTime;

}
