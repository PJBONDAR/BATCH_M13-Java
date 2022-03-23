class Doctor {
	float salary=50000;
}
class Surgeon extends Doctor{
	float bonus=20000;
}

public class Day2 {

	public static void main(String[] args) {
		
		Surgeon s=new Surgeon();
		System.out.println("Salary of surgeon " +s.salary);
		System.out.println("bonus of surgeon " +s.bonus);// TODO Auto-generated method stub
     
	}
}

