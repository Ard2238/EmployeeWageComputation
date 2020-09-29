package empwagecomp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EmpWageComp {
	
	static final int present_fulltime = 1;
	static final int present_parttime = 2;
	
	private ArrayList<CompanyEmpWage> cew_objects = new ArrayList<CompanyEmpWage>();
	

	public static CompanyEmpWage createCEWObject(String name, int totaldays, int totalhours, int perhourwage) {
		
		CompanyEmpWage cew_ob = new CompanyEmpWage(name, totaldays, totalhours, perhourwage);		
		return cew_ob;		
	}
	
	
	public void calculateWage(CompanyEmpWage cew) {
		int work_hours = 0;	
		int total_hours = 0, total_days = 0;	
		
		while (total_days < cew.getTotal_working_days() && total_hours <= cew.getTotal_working_hours())
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
		
		cew.setTotal_wages(total_hours * cew.getPerhour_wage());
		System.out.println("The total monthly wages of " + cew.getCompany_name() + " are " + cew.getTotal_wages());		
	}
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		
		while(choice != 0) {
			
			EmpWageComp ewc= new EmpWageComp();
			
			System.out.println("Do you want to compute wages for another company? \n0. No \n1. Yes");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the company's name:");
				String name = sc.next();
				System.out.println("Enter the total number of working days:");
				int t_days = sc.nextInt();
				System.out.println("Enter the total number of working hours:");
				int t_hrs = sc.nextInt();
				System.out.println("Enter the wage per hour:");
				int ph_wage = sc.nextInt();
				
				CompanyEmpWage cew = createCEWObject(name,t_days,t_hrs,ph_wage);
				ewc.calculateWage(cew);
				ewc.cew_objects.add(cew);
			}
		}
		sc.close();
		return;
	}
}


