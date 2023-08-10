package cgg.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String query= "insert into student values (?,?,?)";
        
        
        //fire query
        int cnt = template.update(query,246,"abc","sec");
        System.out.println("Number of records inserted..."+cnt);
    }
}
