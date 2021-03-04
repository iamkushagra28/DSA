public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {1,56,34,98,11};
    int length = arr.length;
    int minIndex = 0;
    int swap;
    for(int i=0; i<length; i++)
    {
    	minIndex = i;
    	swap = arr[i];
    	for(int j=i+1; j<length; j++)
        {
        	if(arr[j]<arr[minIndex])
            {
            	minIndex = j;
            }
        }
        arr[i] = arr[minIndex];
        arr[minIndex] = swap;
        for(int x=0; x<length; x++)
    {
    	System.out.print(arr[x] + ",");
    }
    System.out.print('\n');
    }
    for(int i=0; i<length; i++)
    {
    	System.out.print("Result- "+arr[i] + ",");
    }
  }
}