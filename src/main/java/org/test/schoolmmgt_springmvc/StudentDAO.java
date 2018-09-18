/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.schoolmmgt_springmvc;

/**
 *
 * @author ASUS
 */

import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

//import com.letsstartcoding.springexample.model.Student;

public class StudentDAO {
    JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	
	public void save(Student s) {
		
        String sql="INSERT INTO student(id,name,email,dateofbirth,gender,contact,intake VALUES('"+s.getId()+"','"+s.getName()+"','"+s.getEmail()+"','"+s.getDateofbirth()+"','"+s.getGender()+"','"+s.getContact()+"',"+s.getIntake()+"')";
	System.out.println(sql);
	template.update(sql);  
	}
	
	public List<Student> getAllStudents() {
		
		
		return template.query("SELECT * FROM student",new ResultSetExtractor<List<Student>>(){  
		    
		     public List<Student> extractData(ResultSet rs) throws SQLException,  
		        DataAccessException {  
		      
		        List<Student> list=new ArrayList<Student>();  
		        while(rs.next()){  
		        Student e=new Student();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setEmail(rs.getString(3));  
		        e.setDateofbirth(rs.getString(4));
		        e.setGender(rs.getString(5));
		        e.setContact(rs.getInt(6));
		        e.setIntake(rs.getString(7));  
  
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  
		
		  }
	
	public List<Student> getStudentsByPage(int pageid, int total) {
		// TODO Auto-generated method stub
		 String sql="SELECT * FROM Student limit "+(pageid-1)+","+total;  
		 return template.query(sql,new ResultSetExtractor<List<Student>>(){  
		    
		     public List<Student> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Student> list=new ArrayList<Student>();  
		        
		        while(rs.next()){  
		        Student e=new Student();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setEmail(rs.getString(3));  
		        e.setDateofbirth(rs.getString(4));
		        e.setGender(rs.getString(5));
		        e.setContact(rs.getInt(6));
		        e.setIntake(rs.getString(7));  
		        
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  }
	
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
				 return template.query("select * from student where ID="+id,new ResultSetExtractor<Student>(){  
					    
				     public Student extractData(ResultSet rs) throws SQLException,  
				            DataAccessException {  
				      
				    	 Student e=new Student();  
				        while(rs.next()){  
				       
				        	e.setId(rs.getInt(1));  
                                                e.setName(rs.getString(2));  
                                                e.setEmail(rs.getString(3));  
                                                e.setDateofbirth(rs.getString(4));
                                                e.setGender(rs.getString(5));
                                                e.setContact(rs.getInt(6));
                                                e.setIntake(rs.getString(7));    
				        }  
				        return e;  
				        }  
				    });  
			}
	
	public int count() {
		String sql="SELECT COUNT (*) FROM Student";
		int count = template.queryForObject(sql,Integer.class);
		return count;
		  }

	public void update(Student s) {
		String sql="UPDATE Student SET Name='"+s.getName()+"',Email='"+s.getEmail()+"',Email='"+s.getEmail()+"',Date of Birth='"+s.getDateofbirth()+"',Gender='"+s.getGender()+"',Contact='"+s.getContact()+"' ,Intake='"+s.getIntake()+"' where ID="+s.getId()+"";
		System.out.println(sql);
       template.update(sql);  
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM Student WHERE ID="+id+"";  
	    template.update(sql);  
		
	}
        
	public void delete() {
		// TODO Auto-generated method stub
		String sql="DELETE FROM Student WHERE ID>0";  
	    template.update(sql); 
	}



	

	

}


