package com.EmployeePortal.EmployeePortal.repositories;

import com.EmployeePortal.EmployeePortal.models.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface jobRepository extends JpaRepository<Jobs, String>, JpaSpecificationExecutor<Jobs> {



}
