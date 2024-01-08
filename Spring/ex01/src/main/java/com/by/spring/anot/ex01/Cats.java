package com.by.spring.anot.ex01;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cats {
    private MyCats myCats;

    public void setMyCats(MyCats myCats) {
        this.myCats = myCats;
    }

    public void getMyCatsInfo(){
        System.out.println("==========================");
        System.out.println("cats Name : " + myCats.getName());
        System.out.println("cats Age : " + myCats.getAge());
        System.out.println("cats hobbys : " + myCats.getHobbys());
        System.out.println("cats Weight : " + myCats.getWeight());
        System.out.println("cats Color : " + myCats.getColor());
        System.out.println("==========================");
    }
}
