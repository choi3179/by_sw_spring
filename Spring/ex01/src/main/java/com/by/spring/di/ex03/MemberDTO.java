package com.by.spring.di.ex03;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data   // Getter/Setter/ToString
@AllArgsConstructor
public class MemberDTO {

    private String name;
    private int age;
    private String message;
}
