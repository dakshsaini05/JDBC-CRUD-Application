package in.biduatech.servicefactory;

import in.biduatech.service.RStudentService;
import in.biduatech.service.StudentServiceImpl;
// Connection connection = DriverManager.getConncetion(url, username,password);
public class StudentServiceFactory {
	// Make Constructor private to avoid Object Creation
	private StudentServiceFactory() {
		
	}
	
	private static RStudentService studentService = null;
	
	public static RStudentService getStudentService() {
		
		//Singleton Design Pattern Code
		if(studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}
}
