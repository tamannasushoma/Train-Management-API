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
@Table(name = "division")
public class Division {
    @Id
    private Long DivisionId;
    @Column(name="div_name")
    private String DivName;
//
//    @OneToMany(mappedBy="divisions", cascade = CascadeType.ALL)

//    @JoinColumn(name="division_id",
//                referencedColumnName = "DivisionId")
@OneToMany(targetEntity = District.class, cascade = CascadeType.ALL)
@JoinColumn(name="division_id")
    private List<District> district= new ArrayList<>();


}

