package coreJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainRun {

	@SuppressWarnings("null")
	public static void main(String args[]) 
	{
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the method to run:\n");
		
		
		for(int i = 0 ; ;)
		{
			System.out.println(" 1. Add \n 2. Delete \n 3. Get an employee \n 4. Get all employees \n 5. Exit\n6. Sort");
			int n = sc.nextInt();
		switch(n)
		{
		case 1 : {
			System.out.println("Add employee info: /n 1. emp id:");
			int empId = sc.nextInt();
			System.out.println("\n2. First name:");
			String firstName = sc.next();
			System.out.println("\n2. Last name:");
			String lastName = sc.next();
			e.setEmpId(empId);
			e.setFirstName(firstName);
			e.setLastName(lastName);
			e.add(e);
			break;
		}
		
		case 2 : {
			System.out.println("Enter emp Id to delete");
			int empId = sc.nextInt();
			e.delete(empId);
			break ;
			}
				
		case 3 : {
			System.out.println("Enter emp Id to get");
			int empId = sc.nextInt();
			e.getEmployee(empId);
			break;
			}
				
		case 4 : {
			BufferedWriter bw = null;
			FileWriter fw = null; 
			
			List<Employee> emp = e.getAllEmployee();
			
			
				try {
					e.format();
				} catch (CustomException e1) {
					// TODO Auto-generated catch block
					
				}
			
			
			emp.forEach(name->System.out.print(name));
			/*
			String last = null;
			for(Employee em : emp )
			{
				
				System.out.println("Emp id"+em.getEmpId());
				System.out.println("Emp name"+em.getFirstName());
				System.out.println("Emp last name"+em.getLastName());
				last = em.getLastName();
			}
			*/
			try {
				fw = new FileWriter("/Users/priyanka/Sample.txt");
				bw = new BufferedWriter(fw);
				bw.write(emp.toString());
				
			}
			 catch (IOException ex) {

					ex.printStackTrace();

				} finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}
		}
		}
				break;
				
		case 5 : System.exit(0);
			
		case 6 : e.sortFirstName();
				 break;
		case 7:
			
			Employee e1=new PartTimeEmployee();
			new Department().dataOfEmployee(e1);
			
		
		
		}
		}
		
	}
}
