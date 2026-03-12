package in.biduatech.persitance;

import java.sql.SQLException;

import in.biduatech.dto.Student;

public interface RStudentDao {
	//Operation to be implemented
	
		public String addStudent(String sname,Integer sage,String saddress) throws SQLException, ClassNotFoundException;
		// student type not string
		public Student searchStudent(Integer sid) throws SQLException;
		
		public String updateStudent(Integer sid,String sname,Integer sage,String saddress) throws Exception; 
		
		public String deleteStudent(Integer sid) throws Exception;

}
