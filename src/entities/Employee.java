package entities;

public class Employee {

	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	Employee(){
		
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return hours * valuePerHour;
	}

	@Override
	public String toString() {
		return name + " - $ "+ payment();
	}
	
	
}
