package net.codejava;

import java.util.List;

import lombok.RequiredArgsConstructor;
import net.codejava.mapper.SalesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@RequiredArgsConstructor
public class SalesDAO {

	/*@Autowired
	private JdbcTemplate jdbcTemplate;*/		// DML 명령어 처리 클래스

	@Autowired
	private SalesMapper salesMapper;

	public List<Sale> list() {
		/*String sql = "SELECT * FROM SALES";

		List<Sale> listSale = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Sale.class));		// RowMapper : sql과 VO class를 매핑시키는 역할

		return listSale;*/
		return salesMapper.selectAll();
	}
	
	public void save(Sale sale) {
		/*SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("sales").usingColumns("item", "quantity", "amount");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		
		insertActor.execute(param);	*/
		salesMapper.insert(sale);
	}
	
	public Sale get(int id) {
		/*String sql = "SELECT * FROM SALES WHERE id = ?";
		Object[] args = {id};
		Sale sale = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Sale.class));
		return sale;*/
		return salesMapper.selectById(id);
	}
	
	public void update(Sale sale) {
		/*String sql = "UPDATE SALES SET item=:item, quantity=:quantity, amount=:amount WHERE id=:id";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);*/
		salesMapper.update(sale);
	}
	
	public void delete(int id) {
		/*String sql = "DELETE FROM SALES WHERE id = ?";
		jdbcTemplate.update(sql, id);*/
		salesMapper.delete(id);
	}
}
