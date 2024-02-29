package polyMorphism;

public class Override extends Overload{
	
	public void mul(int a, int b) {
		System.out.println(100*a*b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Override o = new Override();
		o.mul(1,2);
		Overload oo = new Overload();
		oo.mul(1, 2);
		
	}

}
