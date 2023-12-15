package com.by.spring.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class IMessageImplEng implements IMessage{

    private String message;
    private String hello;


    @Override
    public void sayHello() {
        System.out.println("Setter call : " + getHello());
    }

    @Override
    public String sayMessage() {
        return message;
    }
}
