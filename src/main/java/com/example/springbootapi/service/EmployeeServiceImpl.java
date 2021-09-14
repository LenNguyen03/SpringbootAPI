package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        try {
            employeeRepository.deleteById(id);
            System.out.println("Delete OK !");
        }catch (Exception e){
            System.out.println("Delete Fail Check Again !");
        }
    }

    @Override
    public Employee updateEmployeeById(Long id, Employee employee) {
        Employee employeeData = employeeRepository.findById(id).get();

        employeeData.setFirstName(employee.getFirstName());
        employeeData.setLastName(employee.getLastName());
        employeeData.setEmail(employee.getEmail());

        return employeeRepository.save(employeeData);
    }
}
