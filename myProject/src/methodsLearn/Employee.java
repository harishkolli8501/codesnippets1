package methodsLearn;

import constructorLearn.ConstructorLearn1;

public class Employee {
	
	int empid;
	String name;
	String desi;
	int age;
	String dept;
    int sal;
    static String company="Infy";
    
    //constructor
    private Employee(int eempid,String name,String edesi,int eage,int esal,String edept){
    	empid=eempid;
    	this.name=name;
    	desi=edesi;
    	age=eage;
    	dept=edept;
    	sal=esal;
    	
    }
 
    public void displayEmpDetails(int eempid,String name,String edesi,int eage,int esal,String edept) {
    	
    	System.out.println(this.empid=eempid);
		System.out.println(this.name=name);
		System.out.println(this.desi=edesi);
		System.out.println(this.age=eage);
		System.out.println(this.dept=edept);
		System.out.println(this.sal=esal);
		System.out.println(company);

    }
    
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
	//	Employee e1 = new Employee();
		//e1.displayEmpDetails(001,"Harish","sr engineer",21,10000,"test");
		
		//e1.empid=001;
		
		ConstructorLearn1 ctl= new ConstructorLearn1();
		System.out.println(ctl.a);
//		e1.name="Harish";
//		e1.desi = "sr engineer";
//		e1.age=21;
//		e1.sal=100000;
//		e1.dept="test";
		
		//e1.displayEmpDetails();
		
		System.out.println("*************");
		
	//	Employee e2 =new Employee();
    //e2.displayEmpDetails(002,"Vaishu", "sr engineer", 22, 100001, "dev");
		
//		e2.empid=002;
//		e2.name="Vaishu";
//		e2.desi = "sr engineer";
//		e2.age=22;
//		e2.sal=100001;
//		e2.dept="dev";
		
		//e2.displayEmpDetails();
		
		Employee empp = new Employee(001,"Harish","engineer",26,100002,"test");
		System.out.println(empp.age);
	}

}
