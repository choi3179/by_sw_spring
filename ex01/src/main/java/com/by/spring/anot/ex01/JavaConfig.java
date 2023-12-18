package com.by.spring.anot.ex01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * 자바 기반으로 설정 파일 생성
 */
@Configuration
public class JavaConfig {

    // 객체를 빈으로 생성하는 애노테이션 추가
    @Bean
    public MyCats cat1() {
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("뒹굴기");
        hobbys.add("앞발들기");

        MyCats myCats = new MyCats("냥이",12,hobbys);
        myCats.setWeight(4.0);
        myCats.setColor("black");

        return myCats;
    }

    @Bean
    public MyCats cat2() {
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("뒹굴기");
        hobbys.add("잠자기");

        MyCats myCats = new MyCats("나비",3,hobbys);
        myCats.setWeight(2.0);
        myCats.setColor("white");

        return myCats;
    }

    @Bean
    public Cats catsInfo() {
        Cats cats = new Cats(this.cat1());      // ref = ""
        return cats;
    }
}
