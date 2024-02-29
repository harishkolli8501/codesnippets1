package access1;

public class AccessLearn1 {
	
	public int pub = 1000;
	
	int def = 100;
	
	static protected int prot = 500;
	
	private int priv = 10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessLearn1 oo = new AccessLearn1();
		System.out.println(oo.pub);
		System.out.println(oo.def);
		System.out.println(oo.prot);
		System.out.println(oo.priv);

	}

}
