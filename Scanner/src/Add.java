import java.util.Scanner;
public class Add
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);// TODO Auto-generated method stub
        int a,b,add;
        System.out.println("Enter the number 1");
        a=sc.nextInt();
        System.out.println("Enter the number 2");
        b=sc.nextInt();
        add = a+b;
        System.out.println("Sum of two numbers="+add);
	}
}
