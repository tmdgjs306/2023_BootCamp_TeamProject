package com.example.FEC_Server.domain.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FarmPlantData {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 기본키 PK

    private int farmId; // 외래키 FK
    private String plantName;

}
