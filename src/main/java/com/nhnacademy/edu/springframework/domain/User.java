package com.nhnacademy.edu.springframework.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class User {
    private final String email;
    private final String phoneNumber;
}
