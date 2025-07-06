package MyPackage;



class A {
	int a = 10;
	public void show() {
		System.out.println("value of a: "+a);
	}
	
	class B{
		
		int b = 5;
		public void show() {
			System.out.println("value of b: "+b);
		}
	
	}
}

public class Main {
	
	public static void main(String args[]) {
		
		A obj = new A();
		obj.show();
		
		A.B obj1 = obj.new B();
		
		obj1.show();
		
	}
	

}
