package panboTestProgram;
/**
 * ÷±Ω”—°‘Ò≈≈–Ú
 * @author hepb
 *
 */

public class PanSelectSort {
	public static void main(String[] args)
	{
		int[] array = {63, 4, 24, 1, 3, 15};
		
		PanSelectSort sorter = new PanSelectSort();
		
		sorter.sort(array);
	}
	
	
	public void sort(int[] array)
	{
		int index;
		for (int i=1; i< array.length; i++)
		{
			index = 0;
			for (int j=1; j<=array.length - i; j++)
			{
				if (array[j] >array [index])
					index = j;
				
			}
			int temp = array[array.length-i];
			array[array.length-i]=array[index];
			array[index]=temp;
		}
		
		PanBubbleSort showArray = new PanBubbleSort();
		showArray.showArray(array);
		//PanBubbleSort.showArray(array);
	}

}
