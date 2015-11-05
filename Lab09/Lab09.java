import java.util.*;

public class Lab09 {

    /**
     * Helper method for printing out arrays.
     * @param int[] arr Array of integers to print
     */
    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	if (arr.length > 0) {
	    System.out.print(arr[arr.length - 1]);
	}
	System.out.println(" ]");
	    
    }

    /**
     * Swap two elements in an array
     * @param int[] arr - the array
     * @param int index1 - the index of first element to swap
     * @param int index2 - the index of the second element to swap
     */

    public static void swap(int[] arr, int index1, int index2) {
	if (index1 == index2) {
	    // Do nothing!
	} else {
	    int tmp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = tmp;
	}
    }

    /**
     * Sort an array in ascending order using the Selection Sort algorithm
     * @param int[] arr - the array
     */
    
    public static int selectionSort(int[] arr) {
	
	if (arr.length < 2) {
	    return -1;
	}
	
	int minIndex = 0;
	int minVal = 0;
	int numSwaps = 0;

	for (int j = 0; j < (arr.length-1); j++) {

	    // printArray(arr);
	    minIndex = j;
	    minVal = arr[j];
	    for(int k = j + 1; k < arr.length; k++) {

		if (arr[k] < minVal) {

		    minVal = arr[k];
		    minIndex = k;
		}
	    }
	    swap(arr, j, minIndex);
		numSwaps++;
	}
		return numSwaps;
    }
	
	/**
     * Sort an array in ascending order using the Selection Sort algorithm
     * @param int[] arr - the array
     */
	
	public static int bubbleSort(int[] arr) 
	{
		if (arr.length < 2)
			return -1;
		
		int numSwaps = 0;
		int curNumSwaps = 0;
		// printArray(arr);
		
		do 
		{
			curNumSwaps = 0;
			for (int i = 0; i < arr.length - 1; i++)
			{
				if (arr[i] > arr[i + 1])
				{
					swap(arr, i, i + 1);
					// printArray(arr);
					curNumSwaps++;
				}
			}
			numSwaps += curNumSwaps;
		}
		while (curNumSwaps != 0);
		
		return numSwaps;
	}

	/**
     * Make a deep copy of an array, even if it's jagged
     * @param int[][] arr - the array
     */
	
	public static int[][] deepCopy(int[][] arr)
	{
		int rowLength;
		int[][] copyArr = new int[arr.length][];		
		for (int i = 0; i < arr.length; i++)
		{
			rowLength = arr[i].length;
			copyArr[i] = new int[rowLength];
			for (int j = 0; j < rowLength; j++)
			{
				copyArr[i][j] = arr[i][j];
			}
		}
		
		return copyArr;
		
	}

    public static void main(String[] args) {
	int[][] a1 = { {8, 9, 5, 6, 4, 3},
		       {9, 0, 14, 13, 10, 8, 2, 1, 17, 18, 19, 201, 220, 235, 2},
		       {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200 },
		       {22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 1},
		       {20, 18, 13, 12, 11, 9, 6, 5, 4, 3, 2, 1, -87, -900, -9, -909, -911, -80, -44, -32, -1000} };
	int[][] a2 = deepCopy(a1);
	
	int numSwaps;
	for (int i = 0; i < a1.length; i++)
	{
		System.out.printf("Row %d\n", i + 1);
		System.out.print("Bubble sort: ");
		numSwaps = bubbleSort(a1[i]);
		printArray(a1[i]);
		System.out.printf("Number of swaps: %d\n", numSwaps);
		System.out.printf("Selection sort: ");
		numSwaps = selectionSort(a2[i]);
		printArray(a2[i]);
		System.out.printf("Number of swaps: %d\n", numSwaps);
	}

    }

    
}