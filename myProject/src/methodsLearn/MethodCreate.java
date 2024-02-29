package methodsLearn;

public class MethodCreate {
	
	int abc=100;
	static int xyz=600;
	
	public static void hello() {  //static method
		System.out.println("hello");
		System.out.println("Welcome to java" );
		System.out.println("Welcome to Quality Thought");
	}
	
	public void harish() {         //non static method
		System.out.println("learning selenium with java");
	}
	public static void main(String args[]) {
		
		hello(); //static method calling
		
		MethodCreate o = new MethodCreate();
		o.harish(); // non static method calling
	}

}
