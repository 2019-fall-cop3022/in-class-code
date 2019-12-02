
public class BinarySearch {
	public static int search (Integer[] numbers, int startIndex, int endIndex, Integer searchKey)
	{
		// base case(s)
		if (startIndex > endIndex)
		{
			return -1;
		}
		// found it
		int middle = (startIndex + endIndex) / 2;
		
		int comparedValue = searchKey.compareTo(numbers[middle]);
		
		if (comparedValue == 0)
		{
			return middle;
		}
		else if (comparedValue > 0)
		{
			// recurse right half
			return BinarySearch.search(numbers, middle + 1, endIndex, searchKey);
		}
		else
		{
			// recurse left half
			return BinarySearch.search(numbers, startIndex, middle - 1, searchKey);
		}
		// approaching a base case
	}
}
