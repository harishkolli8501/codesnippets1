package access2;

import access1.AccessLearn1;
import encapsulationLearn.GetSetMethods;

public class Access1 extends AccessLearn1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AccessLearn1 oo = new AccessLearn1();
//		
//		System.out.println(oo.pub);
//	
//		System.out.println(oo.prot);
		
		GetSetMethods gs = new GetSetMethods();
		
		gs.setAbc(500);
		int a = gs.getAbc();
		System.out.println(a);

	}

}
