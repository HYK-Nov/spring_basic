package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 컴포넌트의 이름을 지정하지 않으면, 그냥 소문자로만 구성된 명칭이 부여됨
@Component
public class Hotel {
//    제어의 역전(IOC): 객체 생성의 제어권을 Hotel이 아닌 외부로 넘김
//    의존성 주입(DI): Hotel 생성시 외부에서 이미 생성된 객체를 주입하는 개념

    //    호텔 내부에 입점한 레스토랑 선언
//    @Autowired
    private Restaurant restaurant;
    //    수석 셰프
//    @Autowired
    private Chef chef;

    @Autowired // 생성자 주입은 생성자 상단에 @Autowired 어노테이션을 붙입니다.
    public Hotel(Restaurant restaurant, @Qualifier("cc") Chef chef){
//        생성자 내부 new 키워드를 이용해 호텔에 집점시킬 식당 종류와 셰프를 선택
        this.restaurant = restaurant;
        this.chef = chef;
    }
    //    호텔 정보 알려주기
    public void inform(){
        String chefName = chef.getClass().getSimpleName();
        String restaurantName = restaurant.getClass().getSimpleName();
        System.out.println("우리 호텔의 레스토랑은 " + restaurantName + "이며, 수석 셰프는 " + chefName + "입니다.");
        restaurant.order();
    }
}
