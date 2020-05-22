package com.EmployeePortal.EmployeePortal.repositories;

import com.EmployeePortal.EmployeePortal.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    public Employees findByEmail(String emial);

    @Query(
           value= "select * from employees order by first_name",
               nativeQuery= true)
    List<Employees> findByFirstName();

    @Query(
            value="select employees.*, j.job_title from employees, jobs j where employees.job_id = j.job_id",
            nativeQuery= true)
    List<Employees> findWithJobTitle();

    @Query(
            value="select employees.*, j.job_title from employees, jobs j where employees.job_id = j.job_id",
            nativeQuery= true)
    Employees findSingleJobTitle(Long id);


}
