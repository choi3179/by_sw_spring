package com.by.spring.springboot.controller.delete;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    /*
        delete는 삭제가 완료되면 statusCode 200 리턴
        자원이 있어서 삭제 or 없어서 삭제하지 않았지만 자원이 없으므로 -> 200 리턴
     */
    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable/*(name = "userId")*/ String userId){

    }
}
