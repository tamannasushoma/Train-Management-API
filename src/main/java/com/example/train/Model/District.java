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
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long DistrictId;

    @Column(name="District_Name")
    private String DistrictName;

    @Column(name="div_id")
    private String DivID;

//    @OneToMany(mappedBy = "district", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
//            CascadeType.REFRESH })
//    private List<Station> stations;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "district", cascade = CascadeType.ALL)
    private List<Station> stations= new ArrayList<>();

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="districtList", referencedColumnName = "DistrictId", nullable = false)
//    private Division divisions;
}
