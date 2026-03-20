package methods;

public class constructorexample {
	int x;
	int y;
	
	constructorexample() //default constructor
	{
		x=30;
		y=40;
	}
	
	constructorexample(int a,int b) //parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {

		constructorexample cd=new constructorexample(300,500);
		
		//cd.sum();
		
		cd.sum();
	}

}
