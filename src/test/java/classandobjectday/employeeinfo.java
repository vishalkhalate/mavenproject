package classandobjectday;

public class employeeinfo {
	
	int emp_id;
	String name;
	String dept;
	int salary;
	
	void display()
	{
		System.out.println(emp_id);
		System.out.println(name);
		System.out.println(dept);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employeeinfo emp=new employeeinfo();
		emp.emp_id=101;
		emp.name="vishal";
		emp.dept="manager";
		emp.salary=40000;
		
		emp.display();
		
		employeeinfo emp1=new employeeinfo();
		
		emp1.emp_id=102;
		emp1.name="neha";
		emp1.dept="hr";
		emp1.salary=40000;
		
		emp1.display();			

	}

}
