package com.example.springbootapi.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    @NotBlank(message = "Please input first name !")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Please input last name !")
    private String lastName;

    @Email(message = "please input correct email format !")
    private String email;
}
