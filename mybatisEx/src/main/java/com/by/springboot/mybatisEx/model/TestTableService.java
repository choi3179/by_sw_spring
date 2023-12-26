package com.by.springboot.mybatisEx.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestTableService {
    // C
    public void insert(TableVO vo) throws Exception;

    //R
    public List<TableVO> selectAllList();

    public TableVO selectByUserCode(int userCode) throws Exception;

    //U
    public int update(TableVO vo) throws Exception;

    //D
    public int deleteByUserCode(int userCode) throws Exception;
}
