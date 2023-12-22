package com.by.spring.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostVo {

    private String account;
    private String email;
    private String address;
    private String password;

    @JsonProperty("phone_number")       // 매핑될 JSON 키값 지정
    private String phoneNumber;
    private String OPT;
}
