package kr.encore.controller;

import kr.encore.model.DeptDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    private DeptDAO deptDAO;

    @RequestMapping("/list.do")
    public String list(Model model) {
        List list = deptDAO.listDept();

        model.addAttribute("list",list);
        return "list";
    }
}
