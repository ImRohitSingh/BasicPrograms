import java.util.Scanner;
public class PrimeCheck 
{
	public static void main(String[] args)
	{
		int num,i;  //declaring variables
		boolean flag=true;  // 'true' represents the state of 'num' to be prime
		Scanner obj=new Scanner(System.in);  // creating reference to accept input from keyboard
		System.out.println("Enter a number: ");
		num=obj.nextInt();     // accepting input
		if(num>1)   // operating only for a valid input
		{
			for(i=2;i<Math.sqrt(num);++i)
				if(num%i==0)
				{
					flag=false;  // 'num' has factors other than 1 and 'num; Not prime;
					break;
				}
				if(flag)  // 'num' is prime
					System.out.println("\n"+num+" is a prime number.\n");
				else
					System.out.println("\n"+num+" is not a prime number.\n");
		}
		else
			System.out.println("\nInvalid input!\n");
		obj.close();
	}  // end of main
}  // end of class
