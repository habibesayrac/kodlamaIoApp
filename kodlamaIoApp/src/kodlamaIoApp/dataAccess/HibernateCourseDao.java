package kodlamaIoApp.dataAccess;

import kodlamaIoApp.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile Course eklendi");
		
	}

}
