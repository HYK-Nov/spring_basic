package com.spring.mvc.chap04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    학생의 성적 정보를 조회, 등록, 삭제할 수 있는 시스템
    
    요청 URL 종류
    1. 학생 성적 정보 등록화면을 보여주고, 성적정보 목록조회 처리
    /score/list : GET 방식
    2. 성적 정보 등록 처리 요청
    /score/register : POST 방식(DB변경 생김)
    3. 성적 정보 삭제 요청
    /score/remove : POST 방식(DB변경 생김)
    4. 성적 정보 상세 요청
    /score/detail : GET 방식(DB변경 없음)
*/
@Controller
@RequestMapping("/score")
public class ScoreController {

    //    1. 성적 등록 화면 띄우기 + 정보 목록 조회
    @GetMapping("/list")
    public String list() {
        System.out.println("/score/list : GET방식");
        return "";
    }

    //    2. 성적 정보 등록 처리 요청
    @PostMapping("/register")
    public String register() {
        System.out.println("/score/register : POST방식");
        return "";
    }

    //    3. 성적 정보 삭제 요청
    @PostMapping("/remove")
    public String remove() {
        System.out.println("/score/remove : POST방식");
        return "";
    }

    //    4. 성적 정보 상세 요청
    @GetMapping("/detail")
    public String detail() {
        System.out.println("/score/detail : GET방식");
        return "";
    }
}
