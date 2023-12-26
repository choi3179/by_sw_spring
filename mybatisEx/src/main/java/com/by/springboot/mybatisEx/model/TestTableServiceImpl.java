package com.by.springboot.mybatisEx.model;

import com.by.springboot.mybatisEx.model.mapper.TestTableMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    DB에 접근하여 데이터를 조회하거나 조작하는 기능 전담하는 객체
    DataBase에 접근하기 위한 로직 & 비즈니스 로직을 분리하기 위해 사용한다.
 */
@Service
@RequiredArgsConstructor
public class TestTableServiceImpl implements TestTableService{

    @Autowired
    TestTableMapper testTableMapper;

    @Override
    public void insert(TableVO vo) {
        testTableMapper.insert(vo);
    }

    @Override
    public List<TableVO> selectAllList() {

        return testTableMapper.selectAllList();
    }

    public TableVO selectByUserCode(int userCode){
        return testTableMapper.selectByUserCode(userCode);
    }

    @Override
    public int update(TableVO vo) {

        return testTableMapper.update(vo);
    }

    @Override
    public int deleteByUserCode(int userCode) {
        return testTableMapper.deleteByUserCode(userCode);
    }
}
