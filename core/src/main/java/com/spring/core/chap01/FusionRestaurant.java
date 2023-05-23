package com.spring.core.chap01;

public class FusionRestaurant implements Restaurant{
    private Chef chef;
    private Course course;

//    FusionRestaurant 내부에서 무슨 Chef와 Course가 들어올지 결정하지 않음
    public FusionRestaurant(){
        this.chef = new JapaneseChef();
        this.course = new JapaneseCourse();
    }
    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
