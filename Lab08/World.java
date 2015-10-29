public class World
{
	public int[][][][][] world;
	
	public World(int size)
	{
		int color;
		world = new int[size][size][size][size][size];
		for (int i = 0; i < world.length; i++)
		{
			for (int j = 0; j < world[i].length; j++)
			{
				for (int k = 0; k < world[i][j].length; k++)
				{
					for (int l = 0; l < world[i][j][k].length; l++)
					{
						for (int m = 0; m < world[i][j][k][l].length; m++)
						{
								color = (i + j + k + l + m ) % 10;
								world[i][j][k][l][m] = color;
						}
					}
				}
			}
		}
	}
	
	public int getColor(int pos1, int pos2, int pos3, int pos4, int pos5)
	{
		return world[pos1][pos2][pos3][pos4][pos5];
	}
	
}