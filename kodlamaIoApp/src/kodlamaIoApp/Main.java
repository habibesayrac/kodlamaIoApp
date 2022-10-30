package kodlamaIoApp;

import kodlamaIoApp.business.CategoryManager;
import kodlamaIoApp.business.CourseManager;
import kodlamaIoApp.business.InstructorManager;
import kodlamaIoApp.core.logging.DatabaseLogger;
import kodlamaIoApp.core.logging.FileLogger;
import kodlamaIoApp.core.logging.Logger;
import kodlamaIoApp.core.logging.MailLogger;
import kodlamaIoApp.dataAccess.HibernateCategoryDao;
import kodlamaIoApp.dataAccess.HibernateCourseDao;
import kodlamaIoApp.dataAccess.JdbcInstructorDao;
import kodlamaIoApp.entities.Category;
import kodlamaIoApp.entities.Course;
import kodlamaIoApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Instructor instructor1 = new Instructor(1,"Engin","Demiroð");
		Course course1 = new Course(1,"Java",200,"OOP",instructor1);
		Category category = new Category(1,"Software");
		
		Course [] courses = {};
		Category [] categories = {};
		
		Logger [] loggers = {new DatabaseLogger(), new MailLogger(),new FileLogger()};

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager.add(instructor1);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses, loggers);
		courseManager.add(course1);

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),categories, loggers);
		categoryManager.add(category);	
		
	
	}

}
