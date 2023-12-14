package com.by.spring.ex01;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InfoController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();

        mav.addObject("name","kim");
        mav.addObject("tel", "010");

        mav.setViewName("/WEB-INF/views/info.jsp");

        return mav;
    }
}
