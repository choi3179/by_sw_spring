package com.by.springboot.mybatisEx.controller;

import com.by.springboot.mybatisEx.model.TableVO;
import com.by.springboot.mybatisEx.model.TestTableService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
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

    @RequestMapping(value="list")
    public ModelAndView AllListView() throws Exception{
        ModelAndView mav = new ModelAndView();

        List<TableVO> allList = testTableService.selectAllList();
        System.out.println(allList);


        mav.addObject("allList", allList);
        mav.setViewName("list");
        return mav;
    }


    @RequestMapping(value="insert")
    public void insert(TableVO tableVO) throws Exception{
        tableVO = new TableVO(1111,"1234");

        testTableService.insert(tableVO);

    }


    @RequestMapping(value="delete")
    //@GetMapping(value = "/delete")
    public ModelAndView deleteByUserCode(HttpServletRequest request) throws Exception{
        ModelAndView mav = new ModelAndView();
        int userCode = Integer.parseInt(request.getParameter("userCode"));
        int result =testTableService.deleteByUserCode(userCode);
        System.out.println("삭제 되었습니다.");

        mav.setViewName("list");
        return mav;
    }

    @GetMapping(value = "/deleteform")
    public ModelAndView deleteForm() {

        ModelAndView mav = new ModelAndView();

        mav.setViewName("deleteForm");

        return mav;
    }

    @PostMapping(value = "/deleteform")
    public ModelAndView delete(HttpServletRequest request) throws Exception {

        ModelAndView mav = new ModelAndView();

        int userCode = Integer.parseInt(request.getParameter("userCode"));
        testTableService.deleteByUserCode(userCode);

        mav.addObject("userCode", userCode);
        mav.setViewName("deleteForm");

        return mav;
    }

    /// 2023.12.27 update
    @RequestMapping("/update/{userCode}")
    public ModelAndView updateForm(@PathVariable("userCode") int userCode) throws Exception {
        ModelAndView mav = new ModelAndView();

        TableVO vo = testTableService.selectByUserCode(userCode);

        mav.addObject("user", vo);
        mav.setViewName("update");

        return mav;
    }

    @PostMapping("/update")
    public String update(TableVO vo) throws Exception {

        ModelAndView mav = new ModelAndView();

        System.out.println("Post [update] -> " + vo);
        testTableService.update(vo);

        mav.setViewName("list");

        return "redirect:/list";
    }

}
