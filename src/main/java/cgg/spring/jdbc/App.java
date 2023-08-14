package cgg.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cgg.spring.jdbc.dao.StudentDao;
import cgg.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started" );
        //spring jdbc -> JdbcTemplate
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentdao",StudentDao.class);
        
        //insert query
//        String query= "insert into student values (?,?,?)";
        
        
        //fire query
//        int cnt = template.update(query,247,"efg","nzb");
//        System.out.println("Number of records inserted..."+cnt);
        
        //Insert method
//        Student student= new Student();
//        student.setId(1768);
//        student.setName("Farooq");
//        student.setCity("WNP");
        
//        int r = studentDao.insert(student);
//        System.out.println("Student added "+r);
        
        //Update method
//        Student student= new Student();
//        student.setId(246);
//        student.setName("Raju");
//        student.setCity("NZB");
        
//        int r = studentDao.change(student);
//        System.out.println(r+" Student(s) updated ");
        
        //Delete Method
//        int r = studentDao.delete(245);
//        System.out.println(r+ " deleted");
        
        //Selecting single student data:
//        Student student = studentDao.getStudent(1768);
//        System.out.println(student);
        
        //Selecting all student data:
        List<Student> students = studentDao.getAllStudents();
        for (Student s : students) {
        	System.out.println(s);
			
		}
        
        
    }
}
