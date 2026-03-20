package methods;

public class student {
	
	int sid;
	String sname;
	int smarks;
	
	void studisplay()
	{
		System.out.println(sid+" "+sname+" "+smarks);
	}
	
	void studetails(int id,String name,int mark)
	{
		sid=id;
		sname=name;
		smarks=mark;
	}
	/*
	student(int id,String name,int mark)
	{
		sid=id;
		sname=name;
		smarks=mark;
	}*/

}
