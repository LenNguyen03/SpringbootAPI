package com.example.springbootapi;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SpringbootApiApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

//    @Test
//    void contextLoads() {
//    }

//    @Test
//    public void saveEmployeeRepo(){
//        Employee employee = Employee.builder()
//                .firstName("Nguyễn")
//                .lastName("Lên")
//                .email("nguyenvalentech@gmail.com")
//                .build();
//        employeeRepository.save(employee);
//    }

}
