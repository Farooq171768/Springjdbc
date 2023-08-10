package cgg.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import cgg.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{

	//dependency
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		//Insert query here
		String query= "insert into student values (?,?,?)";
		int rows = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return rows;
	}
	
	
}
