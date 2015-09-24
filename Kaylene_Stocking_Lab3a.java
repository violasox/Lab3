public class Kaylene_Stocking_Lab3a
{
	
	public static void main(String[] args)
	{
		double startingDistance = 10.0;
		double distance = startingDistance/2.0;
		int numRounds = 1; // Starting at 1 round because we've already halved it once
		
		while (distance != 0.0)
		{
			distance /= 2.0; // Halve the distance
			numRounds++; // Increment the total number of rounds
		}
		
		System.out.printf("It took %d rounds for Paris to reach Helen.\n", numRounds);
	}
	
}