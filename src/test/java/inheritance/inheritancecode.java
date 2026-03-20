package inheritance;

class animal{
	void eat(){
		
		System.out.println("animal eatting");
	}
}

class dog extends animal
{
	void bark() {
		System.out.println("animal barkiing");
	}
}

public class inheritancecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d=new dog();
		d.eat();
		d.bark();

	}

}
