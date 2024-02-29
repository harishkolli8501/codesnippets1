package staticNonStatic;

public class StaticNonStaticLearn {
	
	static int abc = 100;
	
	int xyz=5000;
	
	char ch='d';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticNonStaticLearn obj = new StaticNonStaticLearn();
		byte b = 10;
		System.out.println(abc); // 100
		System.out.println(obj.abc); //100 //global or static variable ,can be called without object reference
		abc=5000;
		System.out.println(obj.abc); //5000
		System.out.println(obj.xyz = 50 ); //50 // non static or instance variable ,cannot access without creating object//
		
		System.out.println(obj.ch); //d
		System.out.println(obj.abc); //5000
		
		StaticNonStaticLearn obj1 = new StaticNonStaticLearn();
		System.out.println(obj1.xyz); //5000
		System.out.println(abc);

	}

}
