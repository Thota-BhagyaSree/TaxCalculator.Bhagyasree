package day1.task;
import java.util.Scanner;
public class TaxCalculator {

	 public static void main(String xyz[])
{
   {   
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Salary :- ");
	double salary = sc.nextInt();
    double tax = 1;
	double hra;
	double da;
	hra=0.15*salary;
	da=0.6*salary;
	double totalsalary=((salary+hra+da));
	if(totalsalary>500000 && totalsalary<=1000000)
	{
		tax = (totalsalary * 0.20);
	}
	if (totalsalary>1000000)
	{
	    tax = (totalsalary*0.30);
	}
	if(totalsalary<500000)
	{
	    tax = 0;
	}
	double Inhandsalary=((totalsalary+hra+da)-tax);
	System.out.println("HRA is "+hra);
	System.out.println("Tax is " +tax);	
	System.out.println("DA is "+da);
	System.out.println("InHand salary is "+Inhandsalary);
   }
}
}
