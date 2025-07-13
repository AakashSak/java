import java.util.Scanner;
public class FizzBuzz
{
	static Scanner ref = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter your number :");
		double number = ref.nextDouble();
		
		if(number %3==0 && number %5==0)
		
		System.out.println(" it is fizzBuzz:");
		
		else if (number %5==0)
		{
			System.out.println(" it is buzz:");
		}
		
		else if (number %3 ==0)
		{
			System.out.println(" it is fizz:");
		}
		else
			System.out.println("it is invalid number:");
	}
}
//number %3==0 && number %5==0