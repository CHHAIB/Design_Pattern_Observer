package observer;

public class TastObserver {

	public static void main(String[] args) {
		Course jee = new Course("JEE");
		Student student1 = new Student("Student1");
		Student student2 = new Student("Student2");
		Student student3 = new Student("Student3");

		jee.subscribe(student1);
		jee.subscribe(student2);
		jee.subscribe(student3);
		jee.unsubscribe(student2);

		if (jee.ObserverList.size() % 2 == 1) {
			jee.setAvailability(false);
		} else {
			jee.setAvailability(true);
		}

	}

}
