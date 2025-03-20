package com.service2.service2;

import com.service2.service2.Dto.UserDto;
import com.service2.service2.entity.TestUser;
import com.service2.service2.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {
    private final UserService userService;
    private final Service service;
    @GetMapping("/service2String")
    public String service2String() {
        return "hi.this is server 2";
    }
    @GetMapping("/service2")
    public String service2() {
        return service.service2();
    }
    @GetMapping("/getallusers")
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/createUser")
    public TestUser createUser(@RequestBody UserDto userDto) {
        log.info("createUser: " + userDto);
        return userService.createUser(userDto);
    }
}
