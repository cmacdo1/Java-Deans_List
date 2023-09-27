import java.util.Scanner;

public class GPA 
{

	public static void main(String[] args) 
	{
		final double GPA = 3.5;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your GPA: ");
		double gpa = scan.nextDouble();
		scan.close();
		
		System.out.println("You entered: " + gpa);
		
		if (gpa >= GPA)
		{
			System.out.println("Congratulations---you made the Dean's List");
		}
		else
		{
			System.out.println("Sorry you didn't make the Dean's List.");
		}

	}

}
