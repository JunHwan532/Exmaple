package com.example.school.restcontroller;


import com.example.school.entity.Member;
import com.example.school.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        System.out.println(memberService.findAll().toString());
        return memberService.findAll();
    }

}
