package cc103assignment;

public class PartTimeEmployee extends Employee {
	
	private double ratePerHour;
	private double wage;
	private int hoursWorked;

	public void setWage(double ratePerHour, int hoursWorked) {
		this.ratePerHour = ratePerHour;
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		wage = ratePerHour * hoursWorked;
		return wage;
	}

	
		
		
	}

	