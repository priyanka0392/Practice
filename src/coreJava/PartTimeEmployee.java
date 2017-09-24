package coreJava;

public class PartTimeEmployee extends Employee{
	
	private int numberOfHours;

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	
	public void data()
	{
		super.data();
		System.out.println("\npart time");
	}


}
