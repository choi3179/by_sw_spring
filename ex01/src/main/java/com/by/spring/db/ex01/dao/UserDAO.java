package com.by.spring.db.ex01.dao;

import com.by.spring.db.ex01.model.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public abstract class UserDAO {

    public abstract Connection getConnection() throws Exception; // 추상 메소드

    //사용(DML 명령어)
    //1. insert
    public void insert(UserVO vo) throws Exception {
        Connection conn = getConnection();
        String sql = "INSERT INTO USERS(ID, NAME, PASSWORD) VALUES(?, ?, ?)";
        PreparedStatement psmt = conn.prepareStatement(sql);

        psmt.setString(1, vo.getId());
        psmt.setString(2, vo.getName());
        psmt.setString(3, vo.getPassword());

        int result = psmt.executeUpdate();
        System.out.println(result + "개 입력 성공");

        conn.commit();

        psmt.close();
        conn.close();
    }

    public ArrayList<UserVO> selectAll() throws Exception {
        Connection conn = getConnection();
        String sql = "SELECT * FROM USERS";
        PreparedStatement psmt = conn.prepareStatement(sql);

        ResultSet rs = psmt.executeQuery();

        ArrayList<UserVO> selectList = new ArrayList<>();
        while(rs.next()){
            UserVO vo = new UserVO();
            vo.setId(rs.getString("id"));
            vo.setName(rs.getString("name"));
            vo.setPassword(rs.getString("password"));

            selectList.add(vo);
        }

        rs.close();
        psmt.close();
        conn.close();

        return selectList;
    }

    public ArrayList<UserVO> selectById(String id) throws Exception {
        Connection conn = getConnection();
        String sql = "SELECT * FROM USERS WHERE ID = ?";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setString(1,id);

        ResultSet rs = psmt.executeQuery();

        ArrayList<UserVO> selectList = new ArrayList<>();
        while(rs.next()){
            UserVO vo = new UserVO();
            vo.setId(rs.getString("id"));
            vo.setName(rs.getString("name"));
            vo.setPassword(rs.getString("password"));

            selectList.add(vo);
        }

        rs.close();
        psmt.close();
        conn.close();

        return selectList;
    }

    public boolean update(UserVO vo, String id) throws Exception {
        Connection conn = getConnection();
        String sql = "UPDATE USERS SET ID = ?, NAME = ?, PASSWORD = ? WHERE ID = ?";
        PreparedStatement psmt = conn.prepareStatement(sql);
        try{
            psmt.setString(1,vo.getId());
            psmt.setString(2,vo.getName());
            psmt.setString(3,vo.getPassword());
            psmt.setString(4,id);

            int r = psmt.executeUpdate();
            conn.commit();
        }
        catch(Exception e){
            return false;
        }
        finally{
            psmt.close();
            conn.close();
        }

        return true;
    }

    public boolean delete(String id) throws Exception {
        Connection conn = getConnection();
        String sql = "DELETE FROM USERS WHERE ID = ?";
        PreparedStatement psmt = conn.prepareStatement(sql);
        try{
            psmt.setString(1,id);

            int r = psmt.executeUpdate();
            conn.commit();
        }
        catch(Exception e){
            return false;
        }
        finally{
            psmt.close();
            conn.close();
        }

        return true;
    }

    //menu
    public void menu() {
        System.out.println("선택 >>>>> \n1.INSERT");
        System.out.println("2.SELECT ALL \n3.SELECT BY ID\n4.UPDATE\n5.DELETE");
    }
}
