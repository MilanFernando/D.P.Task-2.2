package com.service2.service2.entity;

import com.service2.service2.Dto.UserDto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@jakarta.persistence.Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String age;
    private String location;


    public TestUser(String name) {
    }
}
