package com.by.spring.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CarVO {

    private String name;
    @JsonProperty("car_no")
    private String carNo;
}
