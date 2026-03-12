package in.biduatech.daofactory;

import in.biduatech.persitance.RStudentDao;
import in.biduatech.persitance.StudentDaoImpl;

public class StudentDaoFactory {
		// Make Constructor private to avoid Object Creation
		private StudentDaoFactory() {
			
		}
		
		private static RStudentDao studentDao = null;
		
		public static RStudentDao getStudentDao() {
			
			//Singleton Design Pattern Code
			if(studentDao == null) {
				studentDao = new StudentDaoImpl();
			}
			return studentDao;
		}
}
