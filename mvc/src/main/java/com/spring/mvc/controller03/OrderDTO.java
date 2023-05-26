package com.spring.mvc.controller03;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString @NoArgsConstructor
public class OrderDTO {
    private String ordName;
    private int ordNum;
    private String ordFood;
}
