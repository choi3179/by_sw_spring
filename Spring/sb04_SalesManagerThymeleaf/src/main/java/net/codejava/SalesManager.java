package net.codejava;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@SpringBootApplication
public class SalesManager {

	public static void main(String[] args) {
		SpringApplication.run(SalesManager.class, args);
	}

	@Bean    // SqlSessionFactory 객체 생성
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);

		Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/*.xml");
		sessionFactory.setMapperLocations(res);

		return sessionFactory.getObject();
	}
}
