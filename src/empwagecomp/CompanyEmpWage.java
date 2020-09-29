package empwagecomp;

public class CompanyEmpWage {
	
	private String company_name;
	private int total_working_days;
	private int total_working_hours;
	private int perhour_wage;
	private int total_wages = 0;
	
	public 	CompanyEmpWage(String company_name, int total_working_days, int total_working_hours, int perhour_wage) {
		// TODO Auto-generated constructor stub
		
		this.company_name = company_name;
		this.total_working_days = total_working_days;
		this.total_working_hours = total_working_hours;
		this.perhour_wage = perhour_wage;
	}

	public String getCompany_name() {
		return company_name;
	}
	
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	public int getTotal_working_days() {
		return total_working_days;
	}

	public void setTotal_working_days(int total_working_days) {
		this.total_working_days = total_working_days;
	}

	public int getTotal_working_hours() {
		return total_working_hours;
	}

	public void setTotal_working_hours(int total_working_hours) {
		this.total_working_hours = total_working_hours;
	}

	public int getPerhour_wage() {
		return perhour_wage;
	}

	public void setPerhour_wage(int perhour_wage) {
		this.perhour_wage = perhour_wage;
	}

	public int getTotal_wages() {
		return total_wages;
	}

	public void setTotal_wages(int total_wages) {
		this.total_wages = total_wages;
	}
	
	

}
