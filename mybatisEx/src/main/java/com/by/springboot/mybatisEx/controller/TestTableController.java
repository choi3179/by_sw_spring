package com.by.springboot.mybatisEx.controller;

import com.by.springboot.mybatisEx.model.TableVO;
import com.by.springboot.mybatisEx.model.TestTableService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestTableController {

    @Resource
    private TestTableService testTableService;

    @GetMapping(value = "/sign-up")
    public ModelAndView signupForm() {

        ModelAndView mav = new ModelAndView("signup");

        return mav;
    }

    @PostMapping(value = "/sign-up")
    public ModelAndView signUp(TableVO vo) throws Exception {

        ModelAndView mav = new ModelAndView();

        testTableService.insert(vo);
        mav.addObject("vo",vo);
        mav.setViewName("insert");

        return mav;
    }


}
