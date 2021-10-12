package com.example.train.DTO;
import com.example.train.Model.Division;
import com.example.train.Model.Train;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrainDTO {
    private Train train;
}
