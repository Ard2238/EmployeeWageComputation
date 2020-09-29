package empwagecomp;

public interface EmpWageInterface {
	
	public CompanyEmpWage createCEWObject(String name, int totaldays, int totalhours, int perhourwage);
	
	public void calculateWage(CompanyEmpWage cew);
	
}
