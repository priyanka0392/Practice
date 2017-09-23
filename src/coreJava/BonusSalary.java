package coreJava;

public interface BonusSalary {

	public default void calculateBonusSalary(int numberOfHours)
	{
		System.out.println(numberOfHours);
		
	}
	
}
