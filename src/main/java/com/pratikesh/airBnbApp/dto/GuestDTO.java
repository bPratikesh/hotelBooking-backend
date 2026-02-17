package com.pratikesh.airBnbApp.dto;

import lombok.Data;

import java.time.LocalDate;
@Data

public class GuestDTO {
    private Long id;
    private String name;
//    private Gender gender;
    private LocalDate dateOfBirth;
}