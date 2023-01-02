package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	OutsourcedEmployee(){
		
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public final Double payment() {
		return (hours*valuePerHour)+(additionalCharge*1.1);
	}
	
	@Override
	public String toString() {
		return name + " - $ "+ payment();
	}
	
	

}
