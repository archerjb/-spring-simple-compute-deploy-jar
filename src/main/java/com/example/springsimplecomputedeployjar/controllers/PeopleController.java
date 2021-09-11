package com.example.springsimplecomputedeployjar.controllers;

import com.example.springsimplecomputedeployjar.db.IPeopleRepo;
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
    private IPeopleRepo repo;

    public PeopleController(IPeopleRepo repo)
    {
        this.repo = repo;
    }

    @GetMapping
    public ResponseEntity<List<People>> all()
    {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }
}
