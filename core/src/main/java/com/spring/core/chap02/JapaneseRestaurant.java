package com.spring.core.chap02;

public class JapaneseRestaurant implements Restaurant {
    private Chef chef;
    private Course course;

    public JapaneseRestaurant(){
        this.chef = new JapaneseChef();
        this.course = new JapaneseCourse();
    }

    @Override
    public void order() {
        System.out.println("일식을 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
