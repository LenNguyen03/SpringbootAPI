package com.example.springbootapi;


import com.example.springbootapi.config.Springconfig;
import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringbootApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringbootApiApplication.class, args);
    }

//        @Bean
//    public CommandLineRunner run(EmployeeRepository employeeRepository){
//        return args -> {
//            insertEmployee(employeeRepository);
//        };
//    }
//    private void insertEmployee(EmployeeRepository employeeRepository){
//        Employee employee = Employee.builder()
//                .firstName("Van")
//                .lastName("Len")
//                .email("nguyenvanlentech@gmail.com")
//                .build();
//        employeeRepository.save(employee);
//    }


}
