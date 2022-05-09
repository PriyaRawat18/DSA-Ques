public class MyQuicksortk {

  public static void quicksort(int arr[],int start,int end )
  {
    // here i forget to mention the if condition
    if(start<end) {
      int pivot = partition(arr, start, end);
      // this is for left side of array
      quicksort(arr, start, pivot - 1);
      // this is for right side of array
      quicksort(arr, pivot + 1, end);
    }

  }
  // it is the main part of quick sort algorithm

  public static int partition(int arr[], int p, int q) {
    int pivot= q;
    int i = p-1;
    for(int j =p; j<=q;j++)
    {
      // I mistakely mentioned here arr[j]<arr[pivot]
      // i forget to write = sign after that condition
      if(arr[j]<=arr[pivot])
      {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    } // end of the loop
    return i;



  }
  public static void display(int arr[])
  {
    for(int i =0; i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }


  }

}
