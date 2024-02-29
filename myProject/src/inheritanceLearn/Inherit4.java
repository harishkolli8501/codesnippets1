package inheritanceLearn;

public class Inherit4 extends Inherit3 {
	
    static int x=100;
    int y=10;
    int z=500;
    
    public static void hi1() {
    	
    }
    
    public static void main(String[] args) {
		System.out.println(x);
		Inherit4 o =new Inherit4();
		System.out.println(o.a);
		System.out.println(b);
		
		System.out.println(o.aaaa);
	}
}