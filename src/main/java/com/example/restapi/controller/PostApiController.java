package com.example.restapi.controller;

import com.example.restapi.model.BookRequest;
import com.example.restapi.model.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class PostApiController {
    @PostMapping(path = "/post")
    public String post(@RequestBody BookRequest bookRequest) {
        System.out.println("bookRequest = " + bookRequest);

        return bookRequest.toString();
    }

    @PostMapping(path = "/member")
    public MemberDTO postMember(@RequestBody MemberDTO memberDTO) {
        System.out.println("memberDTO = " + memberDTO);

        return memberDTO;
    }
}
