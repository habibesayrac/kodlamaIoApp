package kodlamaIoApp.business;

import java.util.Iterator;

import kodlamaIoApp.core.logging.Logger;
import kodlamaIoApp.dataAccess.CourseDao;
import kodlamaIoApp.entities.Course;

public class CourseManager implements CourseService {
	
	private CourseDao courseDao;
	private Course [] courses;
	private Logger [] loggers;
	
	
	public CourseManager(CourseDao courseDao, Course[] courses,Logger [] loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}


	@Override
	public void add(Course course) throws Exception {
		if (course.getPrice()<0) {
			throw new Exception("Fiyat o dan küçük olamaz");
			}

		for(Course course1:courses) {
			if(course1.getCourseName() == course.getCourseName()) {
				throw new Exception ("Kurs ismi tekrar edemez");
			}
		}
		
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		
	}

}
