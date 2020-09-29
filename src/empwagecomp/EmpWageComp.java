package empwagecomp;

import java.util.HashSet;
import java.util.Scanner;

public class EmpWageComp {

	static final int present_fulltime = 1;
	static final int present_parttime = 2;
	private static HashSet<EmpWageComp> set = new HashSet<EmpWageComp>();
	
	public void calculateWage(int total_working_days, int total_working_hours, int perhour_wage) {
		int work_hours = 0;	
		int total_wages = 0, total_hours = 0, total_days = 0;	
		
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

		System.out.println("The Total Monthly wages are " + total_hours * perhour_wage);
		
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
				
				EmpWageComp comp1= new EmpWageComp();
				comp1.calculateWage(t_days,t_hrs,ph_wage);
				set.add(comp1);
			}
		}
		sc.close();
		return;
	}
}


