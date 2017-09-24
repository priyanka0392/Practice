package coreJava;

public class FullTimeEmployee extends Employee{

	private Float pension;

	public Float getPension() {
		return pension;
	}

	public void setPension(Float pension) {
		this.pension = pension;
	}
	
	public void data() {
		System.out.println("full time data");
	}

	
	
}
