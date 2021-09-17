package com.example.springbootapi.dto;

import com.example.springbootapi.entity.Employee;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EmployeeDTO {

    private String lastName;

    private String email;

    public EmployeeDTO(Employee employee){
        this.email = employee.getEmail();
        this.lastName = employee.getLastName();
    }
}
