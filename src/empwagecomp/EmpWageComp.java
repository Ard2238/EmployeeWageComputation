package empwagecomp;

public class EmpWageComp {

	static final int present_fulltime = 1;
	static final int present_parttime = 2;
	private int total_working_days;
	private int total_working_hours;
	private int perhour_wage;
	
	public EmpWageComp(int total_working_days, int total_working_hours, int perhour_wage) {
		this.total_working_days = total_working_days;
		this.total_working_hours = total_working_hours;
		this.perhour_wage = perhour_wage;
	}
	
	public void calculateWage() {
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
		
		EmpWageComp ewc= new EmpWageComp(20,100,20);
		ewc.calculateWage();		
	}
}


