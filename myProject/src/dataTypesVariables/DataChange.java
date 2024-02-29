package dataTypesVariables;

public class DataChange {
	
	static int xyz = 1000000;  // global variable declaration
	
	int abc =11223;  // instance variable declaration

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =100;  // local variable declaration
		System.out.println(a); // accessing local variable
		
		a=10090;
		short z = 100;
		char b='@';
		System.out.println(b);
		
		System.out.println(z);
		a=z; //able to convert short to int 
	//	z=a;   unable to convert int to short
		
		System.out.println(a);
		
		int aaa=900;
		System.out.println(aaa);
		
		System.out.println(xyz); //accessing global variable
		
		DataChange o = new DataChange();
		System.out.println(o.abc);  //accessing instance variable inside method
		
	}

}
