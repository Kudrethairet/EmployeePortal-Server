package com.EmployeePortal.EmployeePortal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity(name="jobs")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String job_id;

    public String getJob_id() {
        return job_id;
    }



    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Integer getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Integer min_salary) {
        this.min_salary = min_salary;
    }

    public Integer getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Integer max_salary) {
        this.max_salary = max_salary;
    }

    private String job_title;
    private Integer min_salary;
    private Integer max_salary;



}
