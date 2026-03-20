package classandobjectday;

public class classandobject {
	
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
		
		classandobject emp=new classandobject();
		
		emp.emp_id=101;
		emp.name="vishal";
		emp.dept="manager";
		emp.salary=30000;
		
		emp.display();
	
	}

}
