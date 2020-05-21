package com.EmployeePortal.EmployeePortal.controller;

import com.EmployeePortal.EmployeePortal.models.Employees;
import com.EmployeePortal.EmployeePortal.models.Jobs;
import com.EmployeePortal.EmployeePortal.repositories.EmployeesRepository;
import com.EmployeePortal.EmployeePortal.repositories.jobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/getJobs")
public class jobsController {


    @Autowired
    private jobRepository jobsRepository;



    @GetMapping
    private List<Jobs> list() {

        return jobsRepository.findAll();


    }

}
