package com.EmployeePortal.EmployeePortal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;
@Entity(name="employees")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long EMPLOYEE_ID) {
        this.employee_id = EMPLOYEE_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String FIRST_NAM) {
        this.first_name = FIRST_NAM;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String LAST_NAME) {
        this.last_name = LAST_NAME;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String EMAIL) {
        this.email = EMAIL;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String PHONE_NUMBER) {
        this.phone_number = PHONE_NUMBER;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date HIRE_DATE) {
        this.hire_date = HIRE_DATE;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String JOB_ID) {
        this.job_id = JOB_ID;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer SALARY) {
        this.salary = SALARY;
    }

    public Integer getCommission_pct() {
        return commission_pct;
    }

    public void setCommission_pct(Integer COMMISSION_PCT) {
        this.commission_pct = COMMISSION_PCT;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer MANAGER_ID) {
        this.manager_id = MANAGER_ID;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer DEPARTMENT_ID) {
        this.department_id = DEPARTMENT_ID;
    }

    private String first_name;
    private String last_name;

    @Column (unique = true)
    private String email;
    private String phone_number;
    private Date hire_date;
    private String job_id;
    private Integer salary;
    private Integer commission_pct;
    private Integer manager_id;
    private Integer department_id;

}
