package com.encore.naversearch.controller;

import com.encore.naversearch.kakao.KakaoAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class SearchAddressController {

    @Autowired
    private KakaoAddress kakaoAddress;

    @RequestMapping("/address")
    public ModelAndView address(){
        return new ModelAndView("/address");
    }

    @PostMapping("/address")
    public ModelAndView searchAddress(String keyword, int page){

        kakaoAddress.search(keyword,page);

        ModelAndView mav = new ModelAndView("/address");

        return mav;
    }
}
