package com.by.spring.springboot.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)     // 모든 변수를 JSON에서 스네이크 표기법으로 자동변경해줌
public class PutVO {

    private String name;
    private int age;
    private List<CarVO> carList;
}
