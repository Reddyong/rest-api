package com.example.restapi.controller;

import com.example.restapi.model.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
//@Controller
@RestController
@RequestMapping(path = "/api/v1")
public class ResponseApiController {
    @GetMapping(path = "")
//    @ResponseBody
    public MemberDTO user() {
        var user = new MemberDTO();
        user.setName("Kim Kil Dong");
        user.setPhoneNumber("010-1111-1111");
        user.setEmail("aaaa@naver.com");

        log.info("user : {}", user);

        var response = ResponseEntity
                .status(HttpStatus.CREATED)
                .header("x-custom", "hello")
                .body(user);

        return user;
    }
}
