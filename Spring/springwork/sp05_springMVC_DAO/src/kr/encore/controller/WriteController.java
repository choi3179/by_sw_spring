package kr.encore.controller;

import kr.encore.model.DeptDAO;
import kr.encore.model.DeptDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WriteController {

    @Autowired
    private DeptDAO deptDAO;

    @RequestMapping("/write.do")
    public String write(Model model, HttpServletRequest request){
        int no = Integer.parseInt(request.getParameter("deptno"));
        String name = request.getParameter("deptname");
        String loc = request.getParameter("deptloc");
        System.out.println(no + " / " + name + " / " + loc);

        DeptDTO dto = new DeptDTO();
        dto.setDeptno(no);
        dto.setDname(name);
        dto.setLoc(loc);

        deptDAO.insertDept(dto);

        return "redirect:list.do";
    }

    /*@Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int no = Integer.parseInt(request.getParameter("deptno"));
        String name = request.getParameter("deptname");
        String loc = request.getParameter("deptloc");

        System.out.println(no + " / " + name + " / " + loc);

        ModelAndView mav = new ModelAndView();  // 데이터 저장 및 뷰페이지 지정
        mav.addObject("no", no);
        mav.addObject("name", name);
        mav.addObject("loc", loc);

        mav.setViewName("list");        // 이동할 뷰페이지 지정

        return mav;
    }*/
}
