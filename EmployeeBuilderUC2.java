
public class EmployeeBuilderUC2 {
public static void main(String[] args) {
	final int FULL_TIME=1;
	final int WAGE_PER_HR=20;
	double emp_check=Math.floor(Math.random()*10)%2;
	int workinghours=0;
	if(emp_check==FULL_TIME) {
		System.out.println("employee is present");
		workinghours=8;
	
	}
	else
	{
		System.out.println("employee is absent");
	}
	int wage=workinghours*WAGE_PER_HR;
	System.out.println("employee daily wage is"+wage);
}
}
