package com.by.spring.springboot.controller.get;

import com.by.spring.springboot.model.UserVO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")     // GET,
public class GetApiController {

    @GetMapping("/hello")
    public String getHello(){
        return "<h1>Hello SpringBoot</h1>";
    }

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hi() {
        return "<font color='red'> hi </font>";

    }

    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name= "id") String pathId){
        System.out.println("pathVariable : " + pathId);
        return pathId;
    }

    @GetMapping("/query-param01")
    public String queryParam01(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("age") int age){

        System.out.println(name + ", " + email + " , " + age);
        return name + ", " + email + " , " + age;
    }

    @GetMapping("/query-param02")
    public String queryParam02(@RequestParam Map<String,String> queryParam){
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<String,String> entry: queryParam.entrySet()){
            sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append("\n");
        }

        System.out.println(sb);
        return sb.toString();
    }

    @GetMapping("/query-param03")
    public String queryParam03(UserVO vo){      // 객체 타입으로 리턴할 경우 @RequestParam이 필요없다.

        return vo.toString();
    }
}
