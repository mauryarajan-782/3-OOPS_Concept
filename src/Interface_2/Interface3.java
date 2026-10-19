package Interface_2;

interface I2 {	
	void m1();
}

interface I3 {	
	void m2();
}

class A implements I2,I3 {
	public void m1() {
		System.out.println("Method m1 from interface I2");
	}

	public void m2() {
		System.out.println("Method m2 from interface I3");
	}
}

public class Interface3 {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.m1();
		obj.m2();

	}

}