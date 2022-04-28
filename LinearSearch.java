
public class LinearSearch {

	public static void main(String[] args) {

		int[] list = {1,4,4,2,5,-3,6,2};
		
		int a = linearSearch(list, 5);
		
		System.out.print(a);
		
	}

	public static int linearSearch(int[] list, int number)
	{
		for(int i=0; i<list.length; i++)
		{
			if(number == list[i])
				return i;
		}
		
		return -1;

	}
} 
