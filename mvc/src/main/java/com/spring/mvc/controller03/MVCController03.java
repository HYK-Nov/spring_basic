package com.spring.mvc.controller03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/chap03")
public class MVCController03 {

    @RequestMapping("/foodform")
    public String foodForm(){
        return "/chap03/foodform";
    }

    @RequestMapping("/foodorder")
    public ModelAndView foodOrder(String ordName, int ordNum, String ordFood){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("chap03/foodresult");
        mv.addObject("ordName", ordName);
        mv.addObject("ordNum", ordNum);
        mv.addObject("ordFood", ordFood);

        return mv;
    }

    @RequestMapping("/foodform2")
    public String foodForm2(){
        System.out.println("foodform2 확인");
        return "/chap03/foodform2";
    }

    @RequestMapping("/foodorder2")
    public String foodOrder2(Model model, OrderDTO order){
        model.addAttribute("ordName", order.getOrdName());
        model.addAttribute("ordNum", order.getOrdNum());
        model.addAttribute("ordFood", order.getOrdFood());
        System.out.println("foodorder2 확인");
        return "/chap03/foodresult";
    }

    @RequestMapping("/naver")
    public String naver(){
//        리다이렉트는 "redirect:/example2"; 형식으로 문자를 작성하면 실행
//        마치 a태그를 클릭하는 것처럼 자동으로 페이지를 보낼 주소로 이동
//        이 과정에서 포워딩과는 달리 model.addAttribute()처럼 자료를 첨부해 이동시킬수는 없음
//        하지만 get방식으로 이동하는 만큼 쿼리스트링을 붙여서 보내는 것은 가능함
        return "redirect:https://www.naver.com";
    }

    @RequestMapping("/goFoodform")
    public String goFoodform(Model model){
//        리다이렉션 model.addAttribute()를 통한 데이터 전송 불가능
        model.addAttribute("title", "음식주문 키오스크"); // title이라는 이름으로 "음식주문 키오스크" 문자열 적재
//        http://localhost:8080/chap03/foodform 이라는 주소로 이동(리다이렉트이므로 파일 지정이 아님)
//        return "redirect:/chap03/foodform"; // 목적 파일로 포워딩하지 않고 목적 메서드 주소로 리다이렉트
//        /WEB-INF/views/chap03/foodform.jsp 라는 목적 파일로 포워딩
        return "/chap03/foodform"; // 목적 파일인 foodform.jsp로 적재 데이터도 보내는 포워딩 방식
    }
    
//    GET 방식은 url에 쿼리스트링을 붙여서 데이터를 전송하기 때문에
//    리다이렉트 타겟URL에 쿼리스트링을 붙여 리다이렉트를 수행하면 전달 가능함
    @RequestMapping("/searchform")
    public String searchForm(){
//        /WEB-INF/views/chap03/searchform.jsp
        return "/chap03/searchform";
    }

//    네이버 쿼리를 받아서 리다이렉션 해주는 메서드 세팅
    @RequestMapping("/research")
    public String reSearch(String query){ // 쿼리라는 변수에 실려서 전송된 데이터 받기
        return "redirect:https://search.naver.com/search.naver?query=" + query;
    }
}
