// Lab 8 by Kaylene Stocking, CS 401, Prof Laboon MW 1300-1415
// Lab Th 1400-1600

import java.util.*;

public class Lab08
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int dimension, distance;
		World world1 = new World(10);
		Scientist sci = new Scientist(world1);
		while (true)
		{
			dimension = 10;
			while (dimension > 5 || dimension == 0)
			{
				System.out.println("Enter a dimension to travel in (1-5, negative to quit):");
				dimension = sc.nextInt();
			}
			if (dimension < 0)
			{
				System.out.println("The scientist gives up in her quest for understanding.");
				System.exit(0);
			}
			
			System.out.println("Enter units to travel:");
			distance = sc.nextInt();
			int[] pos = sci.move(dimension - 1, distance);
			String color;
			if (pos[5] == 1)
				color = "Lime";
			else if (pos[5] == 2)
				color = "Cerulean";
			else if (pos[5] == 3)
				color = "Goldenrod";
			else
				color = "Black";
			
			System.out.print("Location: [");
			for (int i = 0; i < pos.length - 1; i++)
				System.out.print(pos[i] + " ");
			System.out.println("] = " + color);
		}
	}
}