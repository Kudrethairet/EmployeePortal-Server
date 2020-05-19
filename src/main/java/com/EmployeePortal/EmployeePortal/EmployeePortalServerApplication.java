package com.EmployeePortal.EmployeePortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@SpringBootApplication
public class EmployeePortalServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePortalServerApplication.class, args);

	}
}