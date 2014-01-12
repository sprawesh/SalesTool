package in.demo.salestool;

public class SalesData {
	
	/**
	 * represents the sales data for a given period
	 */
	int data[] = {0, 4, 42};
	
	
	public void display() {		
		System.out.println("Data");
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println("Next value: " + data[i]); 
			sum += i;
		}
		System.out.println("sum : " + sum); 
	}
}
