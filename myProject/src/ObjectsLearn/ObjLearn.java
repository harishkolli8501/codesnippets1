package ObjectsLearn;

class Obj2{
	int a=190;
	static int c=129;
	
	public static void tues() {};
	public void sun() {
		Obj2 e=new Obj2();
		System.out.println(Obj2.c);
		System.out.println(e.a);
	}
}


public class ObjLearn {
    int b=100;
    public void mon() {
    	Obj2 f =new Obj2();
    	System.out.println(f.a);
    	f.sun();
    	Obj2.tues();
    };
    
}
