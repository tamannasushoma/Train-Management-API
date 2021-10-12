package com.example.train.Model;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "StationInfo")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long stationId;

    @Column(name="station_name")
    private String stationName;

    @Column(name="division_name")
    private String division;

//    @OneToMany(mappedBy = "station", cascade = CascadeType.ALL)
//    List<MappingTable> mappingTables;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "district_id")
    private District district;


    @ManyToMany(mappedBy = "station")
    private List<Train> train = new ArrayList<>();




}
