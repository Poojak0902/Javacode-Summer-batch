package basicJava;

public class StringExamples {

	
	//any statement or number or any values which needs to be saved in to a group do logical statements
	
	//non primive Class, String >> class >> Java community 
	
	String str = new String("this is my first String");
	
	String str2="this is my 2nd String and its having integers as well like 1451243263592";
	
	
public void stringExe() {
	String str3 = "this is from method";
	
   str.toUpperCase();
   System.out.println(str);
   //1. contains >> boolean 
  System.out.println(str3.contains("methods"));
  
  // char at particular index
  System.out.println(str3.charAt(10));
  
  // the total numbe rof ch in string
 System.out.println(str2.length());
 System.out.println(str.length());
 System.out.println(str3.length());
  
 // substring > part of a string form particular index
System.out.println(str3.substring(8));
System.out.println(str3.substring(8, 13));

// equals > usd for comaprisons and return types is boolean 
System.out.println(str3.equals("this is from method") + " This is form Equal method ");
System.out.println(str3.equals("This is From method"));

// equalsignore case >> comapres the literal string without cases 
System.out.println(str3.equalsIgnoreCase("this is from method"));
System.out.println(str3.equalsIgnoreCase("This is From method"));


System.out.println(str3.isEmpty());

System.out.println(str3.concat(str));

System.out.println(str3.replace('s', 'p'));

System.out.println(str3.split(str,0));

System.err.println(str.indexOf('s'));
}
//assigning the num value to objects in right order ------------------------------

// creating varibale with single value 
// ARRAY>> collection of values in one variable 

char ch = 'q';

char ch2[]= {'a','b','c'};
static String pincode[] = {"L7A2G5","L6X5H8","hgfytu"};
int studentrollnumber[] = {123,234,456};

public void array() {
	System.out.println(ch2.length);
}



	
	public static void main(String[] args) {
		
		StringExamples obj = new StringExamples();
		//obj.stringExe();
		obj.array();
		System.out.println(pincode);
		
	
	
	
	
	}

}
