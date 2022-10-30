package kodlamaIoApp.business;

import kodlamaIoApp.core.logging.Logger;
import kodlamaIoApp.dataAccess.InstructorDao;
import kodlamaIoApp.entities.Instructor;

public class InstructorManager implements InstructorService{
	
	private InstructorDao instructorDao;
	private Logger [] loggers;
	
	
	

	public InstructorManager(InstructorDao instructorDao, Logger [] loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}



	@Override
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(Logger logger:loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
		
	}

}
