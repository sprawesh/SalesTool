package in.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data  = new SalesData();
		  
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello Happy Soles People!");
		System.out.println("This App Shows Sales Data.");
		System.out.println("---------------------------"); 
		System.out.println("Test 1");
		System.out.println("Test 2"); 
		System.out.println("Test 3"); 
	}
}
