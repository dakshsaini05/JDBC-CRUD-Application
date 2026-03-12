package in.biduatech.service;

import java.sql.SQLException;

import in.biduatech.daofactory.StudentDaoFactory;
import in.biduatech.dto.Student;
import in.biduatech.persitance.RStudentDao;

public class StudentServiceImpl implements RStudentService{
	
	private RStudentDao stdDao;

	@Override
	public String addStudent(String sname, Integer sage, String saddress) throws ClassNotFoundException, SQLException {
		stdDao = StudentDaoFactory.getStudentDao();
		
		return stdDao.addStudent(sname, sage, saddress);
		
	}

	@Override
	public Student searchStudent(Integer sid) throws SQLException {
		stdDao = StudentDaoFactory.getStudentDao();
		
		return stdDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) throws Exception {
		stdDao = StudentDaoFactory.getStudentDao();
		
		return stdDao.updateStudent(sid, sname, sage, saddress);
	}

	@Override
	public String deleteStudent(Integer sid) throws Exception {
		stdDao = StudentDaoFactory.getStudentDao();
		
		return stdDao.deleteStudent(sid);
	}

}
