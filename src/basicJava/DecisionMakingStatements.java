package basicJava;

public class DecisionMakingStatements {

	
	
	
	
	private void ifcondition() {
		String str = " I like oranges ";

		
		if (str.contains("orans")) {
			System.out.println(" yes my statemnt is core=rect");
			int a = 10;
			int b = 20;
			//nested condition 
			if (a<b && b > a) {
				System.out.println(" this is correct a is smaller than b");
			}else {
				System.out.println("b is smaller ");
			}
			
		}else if (str.contains("Mangoes")) {
			System.out.println(" statement is incorrect");
		}else if (str.contains("grapes")) {
			System.out.println(" even this is not correct");
		}else {
			System.out.println("nothing is correct i dont like any of these");
		}
		
	}
	
	
	// switch case > if else
	//helps you take decisions 
		public void switchexample() {
			String weekday = "Sunday";
			
			switch (weekday) {
			case "Monday":
				System.out.println(" it is a blue day");
				break;
			case "Tuesday":
				
				System.out.println(" it is a meeting day");
				break;
			case "Wednesday":
				System.out.println(" it is a working day");
				break;
			case "Thursday":
				System.out.println(" it is a tiring day");
				break;
			case "Friday":
				System.out.println(" it is a party day");
				break;
			case "Saturday":
				System.out.println(" it is a amazing day");
				break;
			case "Sundyirujgtoiregy":
				System.out.println(" Story starts again");
				break;
			default:
				System.out.println(" its Sunday");
				break;
			}
			
		}
	
	
	
	
	
	public static void main(String[] args) {
		 DecisionMakingStatements obj = new DecisionMakingStatements();
		 //obj.switchexample();
		obj.ifcondition();
		

	}




	

	

}
