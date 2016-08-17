package CalculateTax;

public class Tax {
	double grossIncome;
	String state;
	int dependents;
	
	public double calcTax(){
		if(grossIncome >= 50000){
			return grossIncome*0.07;
		} else {
		return grossIncome*0.05;
	}
}
}
