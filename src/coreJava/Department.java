package coreJava;

public class Department {
	
	private int deptId;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public void dataOfEmployee(Employee e) {
	e.data();
	}
}