package kodlamaIoApp.dataAccess;

import kodlamaIoApp.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile Category eklendi");
		
	}

}
