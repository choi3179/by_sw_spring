package com.by.spring.springboot.controller.post;

import com.by.spring.springboot.model.PostVo;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {

    @PostMapping("/post01")
    public void post(@RequestBody Map<String,String> requestData){

        for(Map.Entry<String,String> entry : requestData.entrySet()){
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());
        }


    }

    @PostMapping("/post02")
    public void post02(@RequestBody Map<String,String> requestData){

        requestData.forEach((key,value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });


    }

    @PostMapping("/post03")
    public void post03(@RequestBody PostVo vo){

        System.out.println(vo);
    }
}
