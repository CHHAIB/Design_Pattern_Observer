package observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject{
	private String name;
	private String availability;
	List<Observer> ObserverList; 
	public Course(String name)
	{
		this.setName(name);
		ObserverList=new ArrayList<>();
	}
	
	@Override
	public void subscribe(Observer o) {
		ObserverList.add(o);
		
	}
	@Override
	public void unsubscribe(Observer o) {
		ObserverList.remove(o);
		
	}
	@Override
	public void notifyAllSbscribers() {
		for(Observer observer :ObserverList)
		{
			observer.update(availability);
		}
		
	}
	public void setAvailability(boolean availabile) {
		if(availabile)
		{
			this.availability=this.name+ " is available";
			notifyAllSbscribers();
			return;
		}
		this.availability=this.name+" isn't available";
		notifyAllSbscribers();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String isAvailability() {
		return availability;
	}


}
