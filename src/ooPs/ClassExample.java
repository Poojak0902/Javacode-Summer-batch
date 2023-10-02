package ooPs;

public class ClassExample extends EncapsulationExample {

	
	//multiple things, variable,,datatypes, methods , enums
	
	int rollnumber ;
	String name;
	int marks;
	
	//constructors >> driver of class having sma ename as class , more than one const in class, each const needs to have differnt parameters, each class has default const
	// it has no return typee
	
	public ClassExample(){
	System.out.println(" this is default const");	
	}
	
	public ClassExample(int r, String n, int marks){
		rollnumber = r;
		name =n;
		this.marks = marks;
		System.out.println("this is rollnum "+ r);
		System.out.println("this is name if student > "+n);
		System.out.println("these are marks >> "+ marks);
	}
	public ClassExample(int r , String n){
		rollnumber = r;
		name = n;
		System.out.println("this is rollnum "+ r);
		System.out.println("this is name if student > "+n);
	}
	
	public void returnstudent(int r , String n){
		rollnumber = r;
		name = n;
		System.out.println("this is rollnum "+ r);
		System.out.println("this is name if student > "+n);
	}
	
	//retunr type string, dynamic 
	public String  stringconc(String str1, String str2) {
		String str = str1+str2;
		//System.out.println(str);
		return str;
	}
	
	public int subtract(int a, int b, int d) {
		int c = a-b-d;
		System.out.println(c);
		return c;
	}
	
	
	//over laoding 
	public int ADD(int e, int c) {
		
		int a = e+c;
		System.out.println(a);
		return a;
	}
	
public int ADD(int e, int c, int d) {
		
		int a = e+c;
		System.out.println(a);
		return a;
	}

public double ADD(int e, int c, int d, double r) {
	
	double a = e+c+r;
	System.out.println(a);
	return a;
}
	
	public boolean returnboolean() {
		boolean b = true;
		return b;
	}
	
	// methods : void return type methods 
	// return type : string, int , long, float
	//
	public static void main(String[] args) {
		ClassExample obj = new ClassExample(1, "Pooja", 30); 
		
//new ClassExample(2, "Smriti", 40);
//new ClassExample(3, "Nikky");
//new ClassExample().returnstudent(5, "Vishal");
obj.returnstudent(4, "Balvir");
obj.stringconc("Poo", "ja");
String str = obj.stringconc("sm", "riti");
System.out.println(str);
obj.ADD(3,78);
obj.ADD(78,78);
obj.ADD(53,78);
obj.ADD(3,688);
obj.ADD(43,8);
obj.ADD(43,28);
obj.Setdeparture("Mexico");
obj.getdepature();
obj.ADD(0, 0);
obj.subtract(60, 40);
obj.subtract(60, 20, 10);
obj.Accidental();

	
	
	
	
	}

}
