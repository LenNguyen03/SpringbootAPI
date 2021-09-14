package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public Employee saveEmployee(Employee employee);

    public Employee getEmployeeById(Long id);

    public List<Employee> getAllEmployees();

    public void deleteById(Long id);

    public Employee updateEmployeeById(Long id, Employee employee);


}
