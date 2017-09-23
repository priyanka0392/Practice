package coreJava;

import java.util.List;

public interface EmployeeInterface {
	
	int minSalary = 500;
	public void add(Employee employee);
	public void delete(int empId);
	public Employee getEmployee(int empId);
	public List getAllEmployee();
	
}
