package com.example.springsimplecomputedeployjar.db;

import com.example.springsimplecomputedeployjar.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPeopleRepo extends JpaRepository<People, Integer>
{
}
