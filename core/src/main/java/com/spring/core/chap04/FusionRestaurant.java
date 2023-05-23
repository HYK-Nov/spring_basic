package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fs")
public class FusionRestaurant implements Restaurant {

//    @Qualifier를 필드 주입에서 사용하는 경우는 @Autowired 다음줄에 @Qualifier를 작성
//    @Autowired
    private Chef chef;
//    @Autowired
    private Course course;

//    Setter 주입은 세터 위에 @Autowired 어노테이션을 붙여서 설정
//    @Autowired
    public void setChef(Chef chef){
        this.chef = chef;
    }
//    @Autowired
    public void setCourse(Course course){
        this.course = course;
    }

    //    FusionRestaurant 내부에서 무슨 Chef와 Course가 들어올지 결정하지 않음
//    주입받을 파라미터 왼쪽에 @Qualifier("빈이름") 을 입력하면, 지정 주입 가능
    @Autowired
    public FusionRestaurant(@Qualifier("cc") Chef chef, @Qualifier("cco") Course course){
        this.chef = chef;
        this.course = course;
    }

    //    Setter 주입시 @Qualifier를 사용하는 경우, 디폴트 생성자가 오버로딩 되어있어야 함
    public FusionRestaurant(){}

    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
