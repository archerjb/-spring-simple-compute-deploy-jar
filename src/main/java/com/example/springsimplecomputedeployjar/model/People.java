package com.example.springsimplecomputedeployjar.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class People
{
    private String first;
    private String last;
    private char middleInit;
    private LocalDate birthDate;
}
