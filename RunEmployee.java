package cc103assignment;


import java.util.Scanner;

public class RunEmployee {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Press F for Full Time or P for Part Time: ");
			char ch = sc.next().charAt(0);

			if (ch == 'P') {
				System.out.println("Enter rate per hour and no of hours worked separated by space: ");
				double rh = sc.nextDouble();
				int hw = sc.nextInt();

				PartTimeEmployee e = new PartTimeEmployee();
				e.setName(name);
				e.setWage(rh, hw);

				System.out.println("Name: " + e.getName());
				System.out.println("Wage: " + e.getWage());
			}
			else if (ch == 'F') {
				System.out.println("Enter monthly salary: ");
				double ms = sc.nextDouble();

				FullTimeEmployee e = new FullTimeEmployee();
				e.setName(name);
				e.setMonthlySalary(ms);

				System.out.println("Name: " + e.getName());
				System.out.println("Monthly Salary: " + e.getMonthlySalary());
			}
			else {
				System.out.println("Enter only F or P.");
			}
		}

	}

}
	
	


