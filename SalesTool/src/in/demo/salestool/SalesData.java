package in.demo.salestool;

public class SalesData {

	int data[] = {-1, 0, 4, 42, 84};

	/**
	 * represents the sales data for a given period
	 */
	
	public void display() {		
		System.out.println("Data");
		int sum = 0;		
		for (int i : data) {		
			System.out.println("Next value: " + data[i]); 
			sum += i;
		}
		System.out.println("sum : " + sum); 
	}
}
