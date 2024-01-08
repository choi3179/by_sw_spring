package com.by.spring.springboot.controller.put;

import com.by.spring.springboot.model.PutVO;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")     // PUT 전송 방식 테스트
public class PutController {

    @PutMapping("/put")
    public PutVO put(@RequestBody PutVO vo){
        System.out.println(vo);

        return vo;
    }

}
