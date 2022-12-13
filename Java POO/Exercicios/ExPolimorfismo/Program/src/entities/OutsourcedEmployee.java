package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalChange;
	
	public OutsourcedEmployee() {}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalChange) {
		super(name, hours, valuePerHour);
		this.additionalChange = additionalChange;
	}

	public Double getAdditionalChange() {
		return additionalChange;
	}

	public void setAdditionalChange(Double additionalChange) {
		this.additionalChange = additionalChange;
	}
	
	@Override
	public Double payment(Integer hours, Double valuePerHour) {
		return (valuePerHour * hours) + (additionalChange + ((additionalChange/100) * 10)); 
	}
}
