package com.service2.service2.service;

import com.service2.service2.Dto.UserDto;
import com.service2.service2.entity.TestUser;
import com.service2.service2.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;


    public List<UserDto> getAllUsers() {
        return userRepo.findAll()
                .stream()
                .map(user -> new UserDto(user.getName(),user.getAge(),user.getLocation()))
                .toList();
    }

    public TestUser createUser(UserDto userDto) {
        log.info("createUser in user service: " + userDto);
            TestUser user =new TestUser();
            user.setName(userDto.getName());
            user.setAge(userDto.getAge());
            user.setLocation(userDto.getLocation());

            userRepo.save(user);
            log.info("befor saving user " + user);
            return user;

}}
