package com.by.spring.db.ex01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserVO {
    private String id;
    private String name;
    private String password;
}
