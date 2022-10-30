package kodlamaIoApp.dataAccess;

import kodlamaIoApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
	System.out.println("Jdbc ile Instructor eklendi");
		
	}

}
