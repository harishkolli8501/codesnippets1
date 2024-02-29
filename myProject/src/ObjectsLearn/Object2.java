package ObjectsLearn;

public class Object2 {

	int abc=500;
	
	public void hi() {
		System.out.println("this is hi method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object2 obj = new Object2();
		System.out.println(obj.abc);
		obj.hi();
		
		Object1 obj1 = new Object1();
		System.out.println(obj1.a);
		obj1.hello();
		
		
		System.out.println(Object1.b); // static variable can be accessed using ClassName
		Object1.harish(); // static method accessing using ClassName

	}

}
