package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.entity.Score;

import java.util.List;

public interface ScoreRepository{
//    entity 계층에 score라는 정보가 어떻게 구성되는지 먼저 정의하고 score 객체에 담아와서 처리
    public List<Score> findAll();
    
//    성적 정보 등록
//    리턴 자료는 boolean인데 등록 성공시 true, 실패시 false를 리턴
    boolean save(Score score); // 입력할 테이블 정보를 넘겨줘야함

//    성적 정보 한 개 삭제
    boolean deleteByStudentNumber(int studentNumber);
    
//    성적 개별 조회
    Score findByStudentNumber(int studentNumber);
}
