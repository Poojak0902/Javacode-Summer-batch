package ooPs;

public class EncapsulationExample extends RBC  {

	
	
	private String airlines = "Air Canada";
	
	private String destination;
	
	private String departure;
	
	//get and set >>1. we just get value is set , 2&3, we will have to set and then get
	public String getairline() {
		return airlines;
	}
	
	public void Setdestination(String destination ) {
		this.destination = destination;
		System.out.println(destination);
	}
	
	public String getdestination() {
		return destination;
	}

	public void Setdeparture(String d ) {
		departure = d;
		System.out.println(departure);
	}
	
	public String getdepature() {
		return departure;
	}
	
	
	public int subtract(int a, int b) {
		int c = a-b;
		System.out.println(c);
		return c;
	}
	
	public static void main(String[] args) {
		EncapsulationExample obj = new EncapsulationExample();
		//obj.Setdestination("Delhi Airport");
		obj.getdestination();
		obj.getairline();
		String str= obj.bankname;
		

	}

}
