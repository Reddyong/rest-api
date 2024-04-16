package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {
    @GetMapping(path = "/hello")
    public String hello() {
        var html = "<html> <body> <h1> Hello Spring Boot!! </h1> </body> </html>";
        return html;
    }

    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(
            @PathVariable(name = "message") String msg,
            @PathVariable int age,
            @PathVariable boolean isMan
    ) {
        System.out.println("echo message : " + msg);
        System.out.println("echo age : " + age);
        System.out.println("echo isMan : " + isMan);

        // TODO 대문자로 변환해서 RETURN
        msg = msg.toUpperCase();

        return msg;
    }

    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam(name = "issued_day") String issuedDay
    ) {
        System.out.println("category = " + category);
        System.out.println("issuedYear = " + issuedYear);
        System.out.println("issuedMonth = " + issuedMonth);
        System.out.println("issuedDay = " + issuedDay);
    }

    @GetMapping(path = "/book2")
    public void queryParamDTO(BookQueryParam bookQueryParam) {
        System.out.println("bookQueryParam = " + bookQueryParam);
    }

    // TODO Parameter 두가지 받음 -> int 로 받음 (두 수의 덧셈, 곱셈)

    @GetMapping(path = "/hap")
    public int hap(@RequestParam int n1,
                   @RequestParam int n2) {
        return n1 + n2;
    }

    @GetMapping(path = "/gop")
    public int gop(@RequestParam int n1,
                   @RequestParam int n2) {
        return n1 * n2;
    }
}
