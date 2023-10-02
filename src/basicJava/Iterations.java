package basicJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ooPs.ClassExample;

public class Iterations {

	
	
	
	int i = 10;
	
	
	
	private void ForloopExample() {
	char ch [] = {'a','b','c','d','e'}	;
	System.out.println(ch.length);	
	for (int i = 0; i < ch.length; i++) {
		System.out.println("the index of ch is >> "+ i  + "   with the value of >> "+ ch[i]);
	}
	
	}

	// Iteration in nested for loop
	
	public void nestedforloop() {
		String str = "this is nested loop";
		int y = 5;
		String str2[] = {"Jan", "Feb", "Mar"} ;
		System.out.println(str.length());
		for (int i = 0; i <str.length(); i++) {
			System.out.println("tis is first loop");
			for (int j = 0; j < 2; j++) {
				if (str2.length==3) {
					System.out.println("your condition is passed ");
					System.out.println("this is nested loop ");	
				}
			
			}
			System.out.println(" this is the index of str >> "+ i + "   the value saved at this index is >> "+ str);
			
		}
	}
	
	// while loop 
	
	public void whileMethod() {
		int i = 5;
		String str = "this is java";
		while (str.contains("java")) {
			System.out.println(str);
			System.out.println("print the value of i > "+ i);
			i++;
			break;
		}
	}
	
	// List >> java collection and it is an entity which contains endless string, int, long, flots 
	
	public void listexample() {
		List <String> lst = new ArrayList<String>();
		lst.add("Pooja");
		lst.add("Vishal");
		lst.add("Smriti");
		lst.add("Nikky");
		lst.add("Lakhbir");
		lst.add("Balvir");
		/*
		 * for (int i = 0; i < lst.size(); i++) { System.out.println(lst.get(i)); }
		 */
		for (String str :lst) {
			if (str.contains("Smriti")) {
				System.out.println(str);	
				break;
			}else {
				System.out.println("not contains");
			}
			System.out.println(" running empty");
		}
	
	
	
	
	}
	public static void main(String[] args) {
		 ClassExample obj2= new ClassExample(5, "Demo");
		Iterations obj = new Iterations();
		// obj.ForloopExample();
		//obj.nestedforloop();
		//obj.whileMethod();
		obj.listexample();
		
		

	}


}
