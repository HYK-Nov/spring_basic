package com.spring.mvc.chap04.controller;

import com.spring.mvc.chap04.entity.Score;
import com.spring.mvc.chap04.repository.ScoreRepository;
import com.spring.mvc.chap04.repository.ScoreRepositoryImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
//@AllArgsConstructor // 모든 필드를 초기화해주는 롬복 생성자 어노테이션
@RequiredArgsConstructor // final 필드에 대해서 초기화하는 생성자
public class ScoreController {
    
//    repository 기능을 이용해 데이터를 가져와야 화면에 요청 데이터를 양식에 맞춰서 전달할 수 있음
//    @Autowired
    private final ScoreRepository repository;
//    스프링 4.0 이후로 생성자가 하나인 경우, 어노테이션을 자동으로 적용

    //    1. 성적 등록 화면 띄우기 + 정보 목록 조회
    @GetMapping("/list")
    public String list(Model model) {
        System.out.println("/score/list : GET방식");
        List<Score> scoreList =  repository.findAll();
//        해당 성적 전체를 실어서 화면단으로 보낼 수 있게 적재
        model.addAttribute("scoreList", scoreList);
        return "chap04/score-list";
    }

    //    2. 성적 정보 등록 처리 요청
    @PostMapping("/register")
    public String register(Score score) {
        System.out.println("/score/register : POST방식");
        repository.save(score);
        return "redirect:/score/list";
    }

    //    3. 성적 정보 삭제 요청
    @PostMapping("/remove")
    public String remove(int studentNumber) {
        System.out.println("/score/remove : POST방식");
        repository.deleteByStudentNumber(studentNumber);
        return "redirect:/score/list";
    }
//    @PostMapping("/remove/{sNo}")
//    public String remove(@PathVariable int sNo) {
//        System.out.println("/score/remove : POST방식");
//        repository.deleteByStudentNumber(sNo);
//        return "redirect:/score/list";
//    }

    //    4. 성적 정보 상세 요청
    @GetMapping("/detail")
    public String detail(int studentNumber, Model model) {
        System.out.println("/score/detail : GET방식");
//        레포지토리에서 Score 객체를 받아서 저장하고 적재
        Score score = repository.findByStudentNumber(studentNumber);
        model.addAttribute("score", score);
    // 해당 번호의 성적만 보여주는 페이지, /score/list 주소로 돌아올 수 있는 "목록" 버튼 추가
        return "chap04/detail";
    }
//    @GetMapping("/detail/{sNo}")
//    public String detail(@PathVariable int sNo, Model model) {
//        System.out.println("/score/detail : GET방식");
////        레포지토리에서 Score 객체를 받아서 저장하고 적재
//        Score score = repository.findByStudentNumber(sNo);
//        model.addAttribute("score", score);
//        return "chap04/detail";
//    }
}
