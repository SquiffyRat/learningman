// src/main/java/com.demogroup.demoweb/Controller/HelloWorldController.java
package com.quiz.learningman.controller;

import com.quiz.learningman.dto.MemberDto;
import com.quiz.learningman.entity.Member;
import com.quiz.learningman.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/members")
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "/form")
    public List<String> memberForm(Member member) {
        return memberService.getMemberData(member);
    }

    @PostMapping("/members/info")
    public void memberInfo(@RequestBody MemberDto memberDto){
        System.out.println(memberDto);
    }
}
