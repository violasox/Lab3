// Lab 4 by Kaylene Stocking for CS 401

import java.util.Scanner;

public class Lab4a
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name? > ");
		String name = sc.next();
		
		boolean alive = true;
		int choice, numPeople = 0, numUtil = 0;
		
		while (alive)
		{
			System.out.println("1. Buy people ice cream");
			System.out.println("2. Steal ice cream from people");
			System.out.println("3. Dream about people eating ice cream");
			System.out.println("4. Die");
			System.out.print("Enter next action of " + name + " > ");
			choice = sc.nextInt();
			if (choice != 4)
			{
				System.out.print("How many people? > ");
				numPeople = sc.nextInt();
			}
			
			switch(choice)
			{
				case 1: numUtil += 3*numPeople;
					System.out.println("This action caused " + 3*numPeople + " utils of happiness");
					break;
				case 2: numUtil += -5*numPeople;
					System.out.println("This action caused " + -5*numPeople + " utils of happiness");
					break;
				case 3:
					System.out.println("This action caused 0 utils of happiness");
					break;
				case 4:
					System.out.println(name + " caused " + numUtil + " utils of happiness");
					if (numUtil > 0)
						System.out.println("This was a good, moral life");
					else if (numUtil == 0)
						System.out.println("This was a morally neutral life");
					else
						System.out.println("This was a bad, immoral life");
					alive = false;
					break;
				default:
					System.out.println("Please enter a valid choice");
			}
		}
	}
}


