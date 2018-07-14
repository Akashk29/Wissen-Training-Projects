package hello;

public class Student {

	private int id;
	private String name;
	
	//constructor
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//ID getter
	public int getId() {
		return id;
	}
	
	//ID setter
	public void setId(int id) {
		this.id = id;
	}
	
	//name getter
	public String getName() {
		return name;
	}
	
	//name setter
	public void setName(String name) {
		this.name = name;
	} 
	
	
	
}
