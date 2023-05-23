package com.spring.core.chap03;

/*
    스프링 의존성 주입이 사용되지 않아 생기는 문제
    호텔 클래스 내부에서 현재 직접 객체를 생성해주는 코드의 경우
    나중에 의존객체를 변경해야 할 때 직접 호텔 클래스 내부를 수정해야 함.
    이 경우 OCP를 위배하게 됨.
    심지어 Hotel에서 셰프를 변경한다면, 레스토랑 내부에서 변경해야 하므로 2군데를 수정해야 함.
 */
public class Hotel {
//    제어의 역전(IOC): 객체 생성의 제어권을 Hotel이 아닌 외부로 넘김
//    의존성 주입(DI): Hotel 생성시 외부에서 이미 생성된 객체를 주입하는 개념

    //    호텔 내부에 입점한 레스토랑 선언
    private Restaurant restaurant;
    //    수석 셰프
    private Chef chef;

    public Hotel(Restaurant restaurant, Chef chef){
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
