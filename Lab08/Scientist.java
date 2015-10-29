public class Scientist
{
	public World world;
	public int[] position; 
	
	public Scientist(World world1)
	{
		world = world1;
		position = new int[6];
		for (int i = 0; i < position.length; i++)
			position[i] = 0;
	}
	
	public int[] move(int dimension, int numUnits)
	{
		int curPos = position[dimension];
		while (numUnits < 0 && -1*numUnits > curPos)
		{
			curPos += 10;
		}
		
		int newPos = (curPos + numUnits) % 10;
		position[dimension] = newPos;
		
		int color = world.getColor(position[0], position[1], position[2], position[3], position[4]);
		position[5] = color;
		return position;
	}
}