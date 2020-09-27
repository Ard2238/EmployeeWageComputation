package empwagecomp;

public class EmpWageComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int present = 1;
		int checkEmp = (int) (Math.random() * 10) % 2;
		
		if( checkEmp == present){
			System.out.println("Employee is present.");
		}else{
			System.out.println("Employee is absent.");
		}

	}

}
