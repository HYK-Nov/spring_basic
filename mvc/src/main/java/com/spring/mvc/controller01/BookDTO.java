package com.spring.mvc.controller01;

import lombok.*;

// data 어노테이션은 순환참조 문제가 있어서 쓰지 않는걸 권고
@Getter @Setter
@ToString @NoArgsConstructor // 디폴트 생성자
public class BookDTO {
    private String title;
    private String author;
    private String publisher;
    private int price;
    private double rate;
}
