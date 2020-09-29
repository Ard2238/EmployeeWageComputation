package empwagecomp;

import java.util.HashSet;
import java.util.Scanner;

public class EmpWageComp {
	
	static final int present_fulltime = 1;
	static final int present_parttime = 2;
	
	private int total_working_days;
	private int total_working_hours;
	private int perhour_wage;
	private int total_wages;
	
	private static HashSet<EmpWageComp> set = new HashSet<EmpWageComp>();
	
	public EmpWageComp(int total_working_days, int total_working_hours, int perhour_wage, int total_wages) {
		super();
		this.total_working_days = total_working_days;
		this.total_working_hours = total_working_hours;
		this.perhour_wage = perhour_wage;
		this.total_wages = total_wages;
	}
	
	public void calculateWage() {
		int work_hours = 0;	
		int total_hours = 0, total_days = 0;	
		
		while (total_days < total_working_days && total_hours <= total_working_hours)
		{
			int checkEmp = (int) (Math.random() * 10) % 3;
			switch (checkEmp){
				case present_fulltime:
					work_hours = 8;
					break;
				case present_parttime:
					work_hours = 4;
					break;
				default:
					work_hours = 0;		
			}

			total_hours += work_hours;
			total_days++;

			System.out.println("Current Day Hours: " + work_hours+ "   Total hours: " + total_hours);
		}
		
		total_wages = total_hours * perhour_wage;
		System.out.println("The Total Monthly wages are " + total_wages);
		
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		
		while(choice != 0) {
			System.out.println("Do you want to compute wages for another company? \n0. No \n1. Yes");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the total number of working days:");
				int t_days = sc.nextInt();
				System.out.println("Enter the total number of working hours:");
				int t_hrs = sc.nextInt();
				System.out.println("Enter the wage per hour:");
				int ph_wage = sc.nextInt();
				
				EmpWageComp comp1= new EmpWageComp(t_days,t_hrs,ph_wage,0);
				comp1.calculateWage();
				set.add(comp1);
			}
		}
		sc.close();
		return;
	}
}


