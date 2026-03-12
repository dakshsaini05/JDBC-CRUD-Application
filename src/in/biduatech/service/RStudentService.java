package in.biduatech.service;

import java.sql.SQLException;

import in.biduatech.dto.Student;

public interface RStudentService {
	//Operation to be implemented
	
			public String addStudent(String sname,Integer sage,String saddress) throws ClassNotFoundException, SQLException;
			
			public Student searchStudent(Integer sid) throws SQLException;
			
			public String updateStudent(Integer sid,String sname,Integer sage,String saddress) throws Exception;
			
			public String deleteStudent(Integer sid) throws Exception;
}
