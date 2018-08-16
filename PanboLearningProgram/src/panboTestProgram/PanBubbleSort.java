package panboTestProgram;
/**
 * bubble sort
 * @author hepb
 *
 */

public class PanBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {63, 4, 24 ,1 ,3, 15};
		
		//
		PanBubbleSort sorter = new PanBubbleSort();
		sorter.sort(array);
		

	}
	
	
	// sort
	public void sort (int[] array)
	{
		for (int i=1; i <array.length ; i++)
		{
			
			for(int j = 0; j<array.length-i ; j++) /// action:  j< length - i
			{
				if ( array[j] > array[j+1] )
				{
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		
		showArray(array);
	}
	
	public static void showArray(int[] array)
	{
		for (int i : array)
		{
			System.out.print(i+" > ");
		}
		System.out.println();
	}

}
