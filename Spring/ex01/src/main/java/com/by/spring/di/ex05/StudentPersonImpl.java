package com.by.spring.di.ex05;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class StudentPersonImpl implements Person{

    private String name, gender;
    private int age;

    private ArrayList<Integer> score;

    @Override
    public boolean personShow(String name, int age, String gender) {
        System.out.println(name + " / " + age + " / " + gender);
        return true;
    }

    @Override
    public boolean personShow(Person person) {
        System.out.println(person);
        return true;
    }

    public boolean personShow(ArrayList<Integer> score){
        for (int i = 0; i < score.size(); i++) {
            System.out.println(score.get(i));
        }
        return true;
    }
}
