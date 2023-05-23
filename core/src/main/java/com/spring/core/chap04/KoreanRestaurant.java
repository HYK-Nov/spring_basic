package com.spring.core.chap04;

import com.spring.core.chap03.Chef;
import com.spring.core.chap03.Course;
import com.spring.core.chap03.Restaurant;

public class KoreanRestaurant implements Restaurant {

    //    셰프도 레스토랑 소속
    private Chef chef;
    //    코스 요리 메뉴도 레스토랑 소속
    private Course course;
    public KoreanRestaurant(){
        this.chef = new KoreanChef();
        this.course = new KoreanCourse();
    }

    @Override
    public void order() {
        System.out.println("한식을 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
