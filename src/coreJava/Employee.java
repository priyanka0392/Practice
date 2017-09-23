package coreJava;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.Map;
import java.util.Scanner;

public class Employee implements EmployeeInterface{
	
	private int empId;
	private String firstName;
	private String lastName;
	List<Employee> employees;
	
	
	public Employee() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Priyanka", "Muppuri"));
		employees.add(new Employee(2, "Manish", "hate"));
	}
	
		
	public Employee(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public void add(Employee employee) {
		
		employees.add(employee);
		
	}
	@Override
	public void delete(int empId) {
		for(Employee e : employees)
		{
			if(e.getEmpId() == empId)
				employees.remove(e);			
		}
	}
	
	@Override
	public Employee getEmployee(int empId) {
		for(Employee e : employees)
		{
			if(e.getEmpId() == empId)
				return e;		
		}
		return null;
	}
	@Override
	public List getAllEmployee() {
		return employees;
		
		//sort by last name should change according to situation
		//Custom exception(throw multiple exceptions)
		//method in a new class which implements polymorphism
		
	}
	
	
	
}
