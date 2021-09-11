package com.example.springsimplecomputedeployjar.controllers;

import com.example.springsimplecomputedeployjar.model.People;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("people")
public class PeopleController
{
    private List<People> peeps = List.of(
        new People(0, "Sam", "Thompson", 'C', LocalDate.of(2000, 3, 5)),
        new People(0, "William", "Aaron", 'T', LocalDate.of(1995, 11, 2)),
        new People(0, "Sue", "Insley", 'A', LocalDate.of(2005, 12, 31)),
        new People(0, "Abigail", "Monst", 'R', LocalDate.of(2011, 1, 2))
    );

    @GetMapping
    public ResponseEntity<List<People>> all()
    {
        return new ResponseEntity<>(peeps, HttpStatus.OK);
    }
}
