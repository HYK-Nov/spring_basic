package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("cc")
public class ChineseChef implements Chef {
    @Override
    public void cook() {
        System.out.println("중식 마스터 쓰촨");
    }
}
