package com.example.restapi.controller;

import com.example.restapi.model.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/api")
public class PutApiController {
    @PutMapping(path = "/put")
    public void put(@RequestBody MemberDTO memberDTO) {
        log.info("Request : {}", memberDTO);
    }
}
