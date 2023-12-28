package kr.encore.controller;

import kr.encore.model.DeptDAO;
import kr.encore.model.DeptDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DeleteController {

    @Autowired
    private DeptDAO deptDAO;

    @RequestMapping("/deleteform")
    public String deleteForm(Model model) {
        List list = deptDAO.listDept();

        model.addAttribute("list",list);
        return "delete";
    }

    @RequestMapping("/delete.do")
    public String delete(Model model,  HttpServletRequest request) {
        int no = Integer.parseInt(request.getParameter("deptno"));

        deptDAO.deleteDept(no);

        return "redirect:list.do";
    }
}
