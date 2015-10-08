	import java.util.Scanner;
	import java.util.Random;

public class Dice
{
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		boolean goodInput = false;
		int diceRolls = 0;
		while (!goodInput)
		{
			System.out.println("Please enter the number of times you want to roll 2 dice.");
			if (sc.hasNextInt())
			{
				diceRolls = sc.nextInt();
				if (diceRolls > 0)
					goodInput = true;
				else
					System.out.println("Please enter an integer greater than 0.");
			}
			else
			{
				sc.next();
				System.out.println("Please enter an integer greater than 0.");
			}
		}
		
		boolean finished = false;
		int choice;
		
		while (!finished)
		{
			RollDice(diceRolls, rand);
			System.out.println("Would you like to roll again? 1 = yes");
			choice = sc.nextInt();
			if (choice == 0) {finished = true;}
			else 
			{
				goodInput = false;
				while (!goodInput)
				{
					System.out.println("Please enter the number of times you want to roll 2 dice.");
					if (sc.hasNextInt())
					{
						diceRolls = sc.nextInt();
						if (diceRolls > 0)
							goodInput = true;
						else
							System.out.println("Please enter an integer greater than 0.");
					}
					else
					{
						sc.next();
						System.out.println("Please enter an integer greater than 0.");
					}
				}
				
				
			}
		}
	}
	
	public static void RollDice(int numRolls, Random r)
	{
		int roll1 = 0;
		int roll2 = 0;
		int rollSum = 0;
		
		int[] rollArray = new int[11];
		
		for (int i = 1; i <= numRolls; i++)
		{
			roll1 = r.nextInt(6) + 1;
			roll2 = r.nextInt(6) + 1;
			rollSum = roll1 + roll2;
			rollArray[rollSum - 2]++;
		}
		System.out.println();
		
		for (int i = 0; i <= 10; i++)
		{
			System.out.print(i+2 + "\t");
			System.out.print(rollArray[i] + "\t");
			System.out.printf("%.3f\n", rollArray[i]/(double)numRolls);
		}
	}
}