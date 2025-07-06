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
		
		public static class C{
			int c = 15;
			public void show() {
				System.out.println("value of c: "+c);
			}
		}
	
	}
	
	static class D{
		int d=20;
		public void show() {
			System.out.println("value of d: "+d);
		}
	}
}


public class Main {
	
	public static void main(String args[]) {
		
		A obj = new A();
		obj.show();
		
		A.B obj1 = obj.new B();
		obj1.show();
		
		A.D obj2 = new A.D();
		obj2.show();
		
		
		A.B.C obj3 = new A.B.C();
		obj3.show();
		
		
		
	}
	

}
