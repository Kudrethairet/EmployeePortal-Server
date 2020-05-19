package com.EmployeePortal.EmployeePortal.repositories;

import com.EmployeePortal.EmployeePortal.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    public Employees findByEmail(String emial);

}
