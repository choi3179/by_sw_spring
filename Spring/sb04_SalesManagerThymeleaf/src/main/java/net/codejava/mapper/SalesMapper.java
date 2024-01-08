package net.codejava.mapper;

import net.codejava.Sale;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper     // MyBatis Mapper로 지정하는 애노테이션
public interface SalesMapper {

    // READ
    public List<Sale> selectAll();
    public Sale selectById(int id);

    // C
    public void insert(Sale sale);

    // UPDATE
    public void update(Sale sale);

    // DELETE
    public void delete(int id);
}
