package kodlamaIoApp.entities;

public class Course {
	
	private int id;
	private String courseName;
	private int price;
	private String description;
	private Instructor instructor;
	
	
	
	public Course() {
		super();
	}
	public Course(int id, String courseName, int price, String description, Instructor instructor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.price = price;
		this.description = description;
		this.instructor = instructor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
	

}
