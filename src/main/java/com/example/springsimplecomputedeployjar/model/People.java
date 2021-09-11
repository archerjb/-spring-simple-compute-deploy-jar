package com.example.springsimplecomputedeployjar.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class People
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first;
    private String last;
    private char middleInit;
    private LocalDate birthDate;
}
