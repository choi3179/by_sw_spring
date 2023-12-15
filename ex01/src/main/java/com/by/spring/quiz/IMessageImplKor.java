package com.by.spring.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IMessageImplKor implements IMessage{

    private String message;
    private String hello;

    @Override
    public void sayHello() {
        System.out.println("Constructor call : " + getHello());
    }

    @Override
    public String sayMessage() {
        return message;
    }
}
