package com.by.spring.db.ex01.view;

import com.by.spring.db.ex01.dao.MariaDBUserDAOImpl;
import com.by.spring.db.ex01.dao.UserDAO;
import com.by.spring.db.ex01.model.UserVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("dbEx01Ctx.xml");

        UserDAO dao = ctx.getBean("dao", UserDAO.class);
        dao.menu();

        Scanner sc = new Scanner(System.in);

        while(true){
            String id = "";     // 입력받는 id를 저장하는 변수
            System.out.print("옵션 입력 >> ");
            switch (sc.nextInt()) {
                case 1:
                    UserVO newVo = new UserVO();
                    System.out.print("user ID : ");         newVo.setId(sc.next());
                    System.out.print("user NAME : ");       newVo.setName(sc.next());
                    System.out.print("user PASSWORD : ");   newVo.setPassword(sc.next());
                    dao.insert(newVo);

                    System.out.println(newVo.getId() + " 추가 완료");
                    System.out.println("---------------------------------------");
                    break;
                case 2:
                    ArrayList<UserVO> arr1 = dao.selectAll();
                    for (UserVO vo1 : arr1) {
                        System.out.println("USER [" + vo1.getName() + "] 로그인 정보");
                        System.out.println("ID : " + vo1.getId() + " || PASSWORD : " + vo1.getPassword());
                        System.out.println("*************");
                    }
                    System.out.println("---------------------------------------");
                    break;
                case 3:
                    System.out.print("검색할 ID 입력 : ");
                    ArrayList<UserVO> arr2 = dao.selectById(sc.next());
                    if(arr2.isEmpty()){
                        System.out.println("존재하지 않는 아이디입니다.");
                    }
                    else{
                        for (UserVO vo1 : arr2) {
                            System.out.println("USER [" + vo1.getName() + "] 로그인 정보");
                            System.out.println("ID : " + vo1.getId() + " || PASSWORD : " + vo1.getPassword());
                            System.out.println("*************");
                        }
                    }
                    System.out.println("---------------------------------------");
                    break;
                case 4:
                    System.out.print("수정할 ID : ");        id = sc.next();
                    if(dao.selectById(id).isEmpty()){
                        System.out.println("존재하지 않는 아이디입니다.");
                    }
                    else{
                        UserVO updateVO = new UserVO();
                        updateVO.setId(id);
                        System.out.print("user NAME : ");       updateVO.setName(sc.next());
                        System.out.print("user PASSWORD : ");   updateVO.setPassword(sc.next());
                        if(dao.update(updateVO, id))
                            System.out.println(updateVO.getId() + " 수정 완료");
                        else
                            System.out.println("수정 실패");
                    }
                    System.out.println("---------------------------------------");
                    break;
                case 5:
                    System.out.print("삭제할 ID : ");        id = sc.next();
                    if(dao.delete(id)){
                        System.out.println("삭제 완료");
                    }
                    else{
                        System.out.println(id + " 정보 삭제 실패");
                    }
                    System.out.println("---------------------------------------");
                    break;
                case 99:
                    System.exit(0);
                    break;
                default:
                    System.out.println("입력 오류");
                    break;
            }
        }
    }
}
