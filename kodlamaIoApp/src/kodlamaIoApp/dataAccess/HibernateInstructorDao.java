package kodlamaIoApp.dataAccess;

import kodlamaIoApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile Instructor eklendi");
		
	}

}
