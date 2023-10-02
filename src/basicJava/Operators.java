package basicJava;



public class Operators {

	
	
	// urnary operators >> ++, -- num++, num--, ++num, --num 
	
	 int a =10;
	 int b = 13;
	 
	 public void unrnaryOperator() {
		 int c= a++;
		 System.out.println(c);
		 System.out.println(c++);
		 System.out.println(c--);//10 >> 11 >> 
		 
		 System.out.println(++b);
		 System.out.println(--b);
	 }
	
	 
	 //and operator logical  && and bitwise &
	 
	 public void andOperator() {
		 
		 System.out.println("logical and >> "+ (a<b && b>a) );
		 System.out.println("bitwise and >> "+  (a>b & b>a));
		 System.out.println((a++>a-- && b++ <a++));
	 }
	
	 public void orOperator() {
		 System.out.println("logical and >> "+ (a>b || b>a) );
		 System.out.println("bitwise and >> "+  (a>b | b>a));
	 }
	
	
	 
	 //airthmatic operators 
	 
	 public void airthmaticOpe() {
		 int c = a+b;
		 System.out.println( c + "<< addition " );
		 
		 int d= c-a;
		 System.out.println(d + " << subtraction");
		 
		 int e= d*d;
		 System.out.println(e + " multiplication");
		 
		 int f = d/c;
		 System.out.println(f +" division" );
		 
		 int g = e%c;
		 System.out.println(g + " reminder ");
		 
		 
		 
	 }
	
	
	
	public static void main(String[] args) {
		System.out.println("this is also a logical statement ");
		Operators obj= new Operators();
		 DecisionMakingStatements obj2 = new DecisionMakingStatements();
		 obj2.switchexample();
		//obj.unrnaryOperator();
		//obj.andOperator();
		//obj.orOperator();
		
		obj.airthmaticOpe();

	}

}
