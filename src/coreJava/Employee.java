package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee implements EmployeeInterface, Comparator<Employee>{
	
	private int empId;
	private String firstName;
	private String lastName;
	List<Employee> employees;
	static int count=0;
		
	public Employee() {
		
		employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Priyanka", "muppuri"));
		employees.add(new Employee(2, "Manish", "hate"));
		
	}
			
	public Employee(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		count++;
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
		Iterator<Employee> iter = employees.iterator();
		while (iter.hasNext()) {
		    if (iter.next().getEmpId() == empId) {
		        iter.remove();
		    }
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
		System.out.println("count==="+count);
		return employees;
		
				//method in a new class which implements polymorphism
		
	}
	
	public void sortFirstName()
	{
		Collections.sort(employees, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		System.out.println(employees);
	}
	
	public void sortDesc()
	{
		Collections.sort(employees, new Employee());
		System.out.println(employees);
		
	}
	public String toString() {
        return "[" + firstName + " " + lastName +
                " " + empId  +"]";
    }

	@Override
	public void format() throws CustomException {
		throw new CustomException("darling");
		
	}

	@Override
	public int compare(Employee o1, Employee o2) {		
		
		return o1.lastName.compareTo(o2.lastName);
	}

	public void data() {
		System.out.println("General data");
	}

	
	
}
