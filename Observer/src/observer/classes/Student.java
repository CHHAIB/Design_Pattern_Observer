package observer;

public class Student implements Observer{
	private String name;
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(this.name+" has a new notification "+message);
		
	}
	

}
