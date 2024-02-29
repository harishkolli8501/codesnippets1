package constructorLearn;

public class ConstructorLearn1 {
	
	public int a;
	public int b;
	
	public ConstructorLearn1(){
		
		a=10;
		b=200;
		
		System.out.println("Constructor in parent");
	
	}
	
//	ConstructorLearn1(int a, String b){
//		System.out.println("Constructor in parent");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorLearn1 con = new ConstructorLearn1();
		
		System.out.println(con.a);
		
		
		
	}

}
