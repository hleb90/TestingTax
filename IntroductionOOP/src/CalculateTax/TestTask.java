

package CalculateTax;

public class TestTask {

	public static void main(String[] args) {
		
		
		Tax t = new Tax();   // creating an instance of Tax
		
		t.grossIncome = 50000;
		t.dependents = 2;
		t.state = "NJ";
		
		double yourTax = t.calcTax();  // calculating Tax
		
		System.out.println("Your Tax is: " + yourTax);
		
	}

}
