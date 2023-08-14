package cgg.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cgg.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{

	//dependency(member variable)
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

	@Override
	public int change(Student student) {
		//Updating data
		String query="update student set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	@Override
	public int delete(int studentId) {
		//Deleting 
		String query="delete from student where id=?";
		int r = jdbcTemplate.update(query,studentId);
		return r;
	}

	@Override
	public Student getStudent(int studentId) {
		//Select single student data
		String query="select * from student where id=?";
		RowMapper<Student>  rowMapper=new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
//		Student student = this.jdbcTemplate.queryForObject(query, (rs,rowNum)->{
//			Student st = new Student();
//			st.setId(rs.getInt(1));
//			st.setName(rs.getString(2));
//			st.setCity(rs.getString(3));
//			return st;
//		},studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		//Selecting all students:
		String query="select * from student";
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}
	
	
}
