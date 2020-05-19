package com.EmployeePortal.EmployeePortal.controller;


import com.EmployeePortal.EmployeePortal.models.Employees;
import com.EmployeePortal.EmployeePortal.repositories.EmployeesRepository;
import org.apache.coyote.Response;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/getEmployees")
public class EmployeesController {

    @Autowired
    private EmployeesRepository employeesRepository;

  /*  @GetMapping
    private List<Employees> list() {

        return employeesRepository.findAll();


    }*/
    @GetMapping
    private List<Employees> list() {

        return employeesRepository.findAll();


    }
    @GetMapping("/{id}")
    public Employees get(@PathVariable("id") long id){
        return employeesRepository.getOne(id);
   }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Object add(@RequestBody Employees employee, Long id){


        //if(employeesRepository.findByEmail(employee.getEmail()))
        if(CheckEmail(employee.getEmail())==true){
           try{
               employeesRepository.existsById(id);
           }catch (Exception e){
               System.out.println(e.fillInStackTrace());
           }

           new ResponseEntity<>(HttpStatus.CONFLICT);
            return   "user already exist with the email"+ employee.getEmail();
        }
      else {
            employeesRepository.save(employee);
            return employeesRepository.saveAndFlush(employee);
      }
    }

    public boolean CheckEmail(String email){
        boolean had;
        List<Object> emails = new ArrayList<>();
        int n = list().size();
        for(int i=0; i<n; i++){
            emails.add(list().get(i).getEmail());
        }
        if(emails.contains(email)){
            had = true;
        }
        else{
            had = false;
        }
        //System.out.println(emails);

    return  had;
    }

}
