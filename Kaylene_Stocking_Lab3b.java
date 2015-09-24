import java.util.Scanner;

public class Kaylene_Stocking_Lab3b
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numBottles = 0;
		boolean validInput = false;
		
		do 
		{
			System.out.println("Enter the number of bottles of root beer on the wall: ");
				if(sc.hasNextInt())
				{
					numBottles = sc.nextInt();
					if (numBottles >= 1 && numBottles <= 100)
						validInput = true;
					else
						System.out.println("Enter a number from 1 to 100!");
				}
				else
				{
					sc.next();
					System.out.println("Please enter an integer!");
				}
		} while (!validInput);
		
		for (int loopsRem = numBottles; loopsRem != 0; loopsRem--)
		{
			for (int bottlesRem = loopsRem; bottlesRem != 0; bottlesRem--)
				System.out.print("R");
			System.out.println();
		}
		
		System.out.println("There aren't any bottles of root beer left on the wall!");
	}
}