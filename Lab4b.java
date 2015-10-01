// Lab4b by Kaylene Stocking

import java.util.Scanner;

public class Lab4b
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Level > ");
		int level = sc.nextInt();
		
		switch(level)
		{
			case 5: System.out.println("Self-actualization");
			case 4: System.out.println("Esteem");
			case 3: System.out.println("Love and belonging");
			case 2: System.out.println("Safety");
			case 1: System.out.println("Physiological");
				break;
		}
	}
}