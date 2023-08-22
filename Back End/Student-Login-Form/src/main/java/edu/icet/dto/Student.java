package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String age;
    private String phoneNumber;
    private String email;
    private String address;
    private String institute;
    private String batch;
    private String gender;



}
