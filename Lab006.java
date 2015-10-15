// Lab 6 by Kaylene Stocking, Th 1400-1600 lab

import java.util.Scanner;
import java.io.*;

public class Lab006
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		boolean goodInput = false;
		int size = 0;
		
		while (!goodInput)
		{
			System.out.println("What size universe would you like? ");
			if (sc.hasNextInt())
			{
				size = sc.nextInt();
				if (size > 0)
					goodInput = true;
				else
					System.out.println("Please enter an integer greater than 0.");
			}
			else
				System.out.println("Please enter an integer greater than 0.");
		}
		
		char[] universe = new char[size];
		generateUniverse(universe);
		displayUniverse(universe);
		
		boolean newRound = true;
		char round = 'z';
		String input;
		
		while (newRound)
		{
			input = sc.nextLine();
			if (input.length() > 0)
			{
				round = input.charAt(0);
			}
			else
				continue;
			if (round == 'A')
			{
				updateUniverse(universe);
				displayUniverse(universe);
			}
			else if (round == 'S')
			{
				saveUniverse(universe);
				displayUniverse(universe);
			}
			else if (round == 'Q')
				newRound = false;
		}
	}
	
	public static void generateUniverse(char[] emptyUniverse)
	{
		for (int i = 0; i < emptyUniverse.length; i++)
		{
			emptyUniverse[i] = '.';
		}
		
		for (int i = 5; i < emptyUniverse.length; i+=5)
		{
			emptyUniverse[i] = '^';
		}
		
		for (int i = 0; i < emptyUniverse.length; i+=7)
		{
			emptyUniverse[i] = '0';
		}
	}
	
	public static void updateUniverse(char[] universe)
	{
		for (int i = 0; i < universe.length - 1; i++)
		{
			if (universe[i] == '0')
			{
				universe[i] = '1';
			}
			else if (universe[i] == '1')
			{
				universe[i] = '2';
			}
			else if (universe[i] == '2')
			{
				if (universe[i+1] == '.')
				{
					universe[i] = '.';
					universe[i+1] = '2';
					i++;
				}
				else if (universe[i+1] == '^')
				{
					universe[i] = '.';
					universe[i+1] = '0';
					i++;
				}
			}
		}
	}
	
	public static void saveUniverse(char[] universe) throws IOException
	{
		PrintWriter f = new PrintWriter("universe.txt");
		int numBabies = 0;
		int numChildren = 0;
		int numAdults = 0;
		
		for (int i = 0; i < universe.length; i++)
		{
			if (universe[i] == '0')
				numBabies++;
			else if (universe[i] == '1')
				numChildren++;
			else if (universe[i] == '2')
				numAdults++;
			
			f.print(universe[i]);
		}
		
		f.print("\nNumber of babies: "); 
		f.print(numBabies);
		f.print("\nNumber of children: ");
		f.print(numChildren);
		f.print("\nNumber of adults: ");
		f.print(numAdults);
		f.close();
	}
	
	public static void displayUniverse(char[] universe)
	{
		for (int i = 0; i < universe.length; i++)
		{
			System.out.print(universe[i]);
		}
		System.out.println();
	}
	
}