package in.biduatech.persitance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.cj.xdevapi.Result;

import in.biduatech.dto.Student;
import in.biduatech.util.DBConnections;

public class StudentDaoImpl implements RStudentDao{
	
	private static final String DBURL = "jdbc:mysql://localhost:3306/studentdb";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "daksh@123";

	@Override
	public String addStudent(String sname, Integer sage, String saddress) throws SQLException, ClassNotFoundException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		
		Connection con = DBConnections.getConnection();
		
		String query = "Insert into student(sname, sage, saddress) values(?, ?, ?)";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, sname);
		pstmt.setInt(2, sage);
		pstmt.setString(3, saddress);
		
		int rows = pstmt.executeUpdate();
		if(rows == 1) {
			return "success";
		} else {
			return "failure";
		}
	}

	@Override
	public Student searchStudent(Integer sid) throws SQLException{
		Connection con = DBConnections.getConnection();
		
		String query = "select * from student where sid=?";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, sid);
		
		ResultSet rs = pstmt.executeQuery();
		
		Student student = null;
		
		if(rs.next()) {
			student = new Student();
			
			student.setSid(rs.getInt("sid"));
			student.setSname(rs.getString("sname"));
			student.setSage(rs.getInt("sage"));
			student.setSaddress(rs.getString("saddress"));
		}
		
		return student;
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) throws SQLException {
		Connection con = DBConnections.getConnection();
		
		String query = "update student set sname=?, sage=?, saddress=? where sid=?";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1, sname);
		pstmt.setInt(2, sage);
		pstmt.setString(3, saddress);
		pstmt.setInt(4, sid);
		
		int rows = pstmt.executeUpdate();
		
		if(rows == 1) {
			return "success";
		} else {
			return "failure";
		}
	}

	@Override
	public String deleteStudent(Integer sid) throws SQLException {
		Connection con = DBConnections.getConnection();
		
		String query = "delete from student where sid=?";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, sid);
		
		int rows = pstmt.executeUpdate();
		
		if(rows == 1) {
			return "success";
		} else {
			return "failure";
		}
	}

}
