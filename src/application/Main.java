package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			String resp = sc.next();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if(resp.equals("n")) {
				list.add(new Employee(name,hours,valuePerHour));
			}
			else {
				System.out.print("Additional charge: ");
				Double addCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name,hours,valuePerHour,addCharge));
			}
		}
		
		System.out.println();
		for(Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();
	}
}
