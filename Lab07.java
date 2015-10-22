// Lab 7 by Kaylene Stocking, CS 401 with Professor Laboon
// Thursday 1400-1600 lab with Shelley Goldberg

import java.util.*;

class Lab07 
{
	public static void main(String[] args)
	{
		int numSeasons = 10;
		int maxNewRut = 4;
		int startLength = 5;
		int[] mGarden = new int[startLength];
		int[] pGarden = new int[startLength];
		int mResize = 0, pResize = 0;
		int totalRut = 0, newRut;
		Random rand = new Random();
		
		for (int i = 1; i <= numSeasons; i++)
		{
			newRut = rand.nextInt(maxNewRut + 1);
			if (newRut != 0)
			{
				while ((mGarden.length - totalRut) < newRut)
				{
					mGarden = resize(mGarden, 2);
					mResize++;
					System.out.printf("Resized Martin's garden to %d!\n", mGarden.length);
				}
				addRut(mGarden, totalRut, newRut);
		
				while ((pGarden.length - totalRut) < newRut)
				{
					pGarden = resize(pGarden, pGarden.length);
					pResize++;
					System.out.printf("Resized Pangloss' garden to %d!\n", pGarden.length);
				}
				addRut(pGarden, totalRut, newRut);
				totalRut += newRut;
			}
			System.out.printf("Season: %d, %d rutabaga(s)\n", i, newRut);
		}
		
		System.out.println();
		printGarden(mGarden);
		System.out.printf("Martin garden size: %d. Resized %d times.\n", mGarden.length, mResize);
		printGarden(pGarden);
		System.out.printf("Pangloss garden size: %d. Resized %d times.\n", pGarden.length, pResize);
	}
	
	public static int[] resize(int[] garden, int newSlots)
	{
		int[] newGarden = new int[garden.length + newSlots];
		for (int i = 0; i < garden.length; i++)
		{
			newGarden[i] = garden[i];
		}
		
		return newGarden;
	}
	
	public static void addRut(int[] garden, int totalRut, int newRut)
	{
		for (int i = 0; i < newRut; i++)
		{
			garden[totalRut + i] = newRut;
		}
	}
	
	public static void printGarden(int[] garden)
	{
		System.out.print(" [");
		for (int i = 0; i < garden.length; i++)
		{
			if (garden[i] != 0)
				System.out.print(garden[i]);
			else
				System.out.print("***");
			if (i < garden.length - 1)
				System.out.print(", ");
		}
		
		System.out.print(" ]\n");
	}
}