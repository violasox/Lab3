import java.util.*;
import java.io.*;

public class Lab13
{
	public static void main(String[] args)
	{
		new Lab13();
	}
	
	public Lab13()
	{
		// ArrayIndexOutOfBoundsException
		try 
		{
			int matrix[][] = new int[5][5];
			for (int i = 0; i <= matrix.length; i++)
			{
				for (int j = 0; j <= matrix[i].length; j++)
					matrix[i][j] = i*j;
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
		}
		
		// ArithmeticException
		try
		{
			int y = 0, z = 0;
			int x = y / z;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		
		// FileNotFoundException
		try
		{
			File f = new File("DefinitelyNotAFile.txt");
			Scanner fsc = new Scanner(f);
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.toString());
		}
		
		// NegativeArraySizeException
		try 
		{
			int antiMatrix[][] = new int[10][-1];
		}
		catch (NegativeArraySizeException e)
		{
			System.out.println(e.toString());
		}
		
		// NoSuchElementException
		try
		{
			Enumeration books;
			Vector bookTitles = new Vector();
			bookTitles.add("The Sorcerer's Stone");
			bookTitles.add("The Chamber of Secrets");
			bookTitles.add("The Prisoner of Azkaban");
			bookTitles.add("The Goblet of Fire");
			bookTitles.add("The Order of the Phoenix");
			bookTitles.add("The Half-Blood Prince");
			bookTitles.add("The Deathly Hallows");
			books = bookTitles.elements();
			for (int i = 0; i < 8; i++)
			{
				System.out.println(books.nextElement());
			}
		}
		catch (NoSuchElementException e)
		{
			System.out.println(e.toString());
		}
		
		// NumberFormatException
		try
		{
			String number = "5.42";
			int number2 = Integer.parseInt(number);
		}
		catch (NumberFormatException e)
		{
			System.out.println(e.toString());
		}
		
		// NoogieException
		try
		{
			throw(new NoogieException());
		}
		catch (NoogieException e)
		{
			System.out.println(e.toString());
		}
		
		// CoogieException
		try	
		{
			throw(new CoogieException(5000));
		}
		catch (CoogieException e)
		{
			System.out.println(e.toString());
		}
	}
		
	class NoogieException extends Exception
	{
		public NoogieException()
		{
			
		}
	}
	
	class CoogieException extends Exception
	{
		int numCats;
		
		public CoogieException(int tooManyCats)
		{
			numCats = tooManyCats;
		}
		
		public String toString()
		{
			return Integer.toString(numCats) + " is too many cats!";
		}
	}
}