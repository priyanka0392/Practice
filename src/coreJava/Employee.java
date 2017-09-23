package coreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// pikachu here
public class Employee implements EmployeeInterface{
	
	private int empId;
	private String firstName;
	private String lastName;
	List<Employee> employees;
	
	
	public Employee() {
		employees = new ArrayList<Employee>();
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
		

	}
	
	@Override
	public int getEmployee(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
		//sort by last name should change according to situation
		//user entry till user says no
		//write all the entries in a file
		//Custom exception(throw multiple exceptions)
		//method in a new class which implements polymorphism
		
	}
	
	
	
}
