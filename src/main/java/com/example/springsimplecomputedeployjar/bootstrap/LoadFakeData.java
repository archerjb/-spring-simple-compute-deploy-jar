package com.example.springsimplecomputedeployjar.bootstrap;

import com.example.springsimplecomputedeployjar.db.IPeopleRepo;
import com.example.springsimplecomputedeployjar.model.People;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class LoadFakeData implements CommandLineRunner
{
    private List<People> peeps = List.of(
        new People(0, "Sam", "Thompson", 'C',LocalDate.of(2000, 3, 5)),
        new People(0, "William", "Aaron", 'T', LocalDate.of(1995, 11, 2)),
        new People(0, "Sue", "Insley", 'A', LocalDate.of(2005, 12, 31)),
        new People(0, "Abigail", "Monst", 'R', LocalDate.of(2011, 1, 2))
    );
    private IPeopleRepo repo;

    public LoadFakeData(IPeopleRepo repo)
    {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception
    {
        //load fake data...
        for (People person : peeps)
        {
            repo.save(person);
        }
    }
}
