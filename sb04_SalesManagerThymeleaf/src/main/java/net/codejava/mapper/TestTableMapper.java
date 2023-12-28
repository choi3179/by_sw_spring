package com.by.springboot.mybatisEx.model.mapper;

import com.by.springboot.mybatisEx.model.TableVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper     // MyBatis Mapper로 지정하는 애노테이션
public interface TestTableMapper {
    // C
    public void insert(TableVO vo);

    //R
    public List<TableVO> selectAllList();

    public TableVO selectByUserCode(int userCode);

    //U
    public int update(TableVO vo);

    //D
    public int deleteByUserCode(int userCode);
}
