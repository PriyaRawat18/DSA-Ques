// Min heap
public class BinaryHeapbyArray {
  int arr[];//instance variable
  int sizeoftree; // instance variable
  public BinaryHeapbyArray(int size) // parameterised constructor
  {
    arr = new int[size+1];
    sizeoftree = 0;
  }
public int sizeofarray()
{
  return arr.length;
}

public int getSizeoftree()
{
  return sizeoftree;
}
  public void deleteheaptree()
  {
    arr = null;
    System.out.println("heap deleted");
  }

  public boolean isheapempty() {
    if (sizeoftree == 0)
      return true;
    else
      return false;
  }
  public void peekinheap() {
    if (sizeoftree == 0) {
      System.out.println("heap empty");
    } else
      System.out.println(arr[1]);
  }
  public void insert(int value)
  {
    arr[sizeoftree+1]= value;
    sizeoftree++;
    heapify(sizeoftree);
  }
  public void heapify(int index) {
    int parent = index / 2;
    if (index <= 1) {
      return;
    }
    if (arr[index] < arr[parent]) {
      int temp = arr[index];
      arr[index] = arr[parent];
      arr[parent] = temp;
    }
    heapify(parent);
  }
public void display()
{
  for(int i =1;i<=sizeoftree;i++)
  {
    System.out.println(arr[i]);
  }
}

public int extract()
{
  if(sizeoftree==0)
  {
    System.out.println("heap is empty");
   return -1;
  }
  else
  {
    int result = arr[1];
    arr[1] = arr[sizeoftree];
    sizeoftree--;
    heapifyextract(1);
    return result;
  }
}

// the only element that can be extracted from a heap i.e root
  // we cannot extract other element that is the property of heap
  // if we extract root element then we need some adjustment
  // so the last element in the heap will always be considered as root
  // after promoting the last element at root we will check it satisfies the min heap property
  // if not then we swap the values (after comparing the left and right side values)
  // and we will implement this recursively



public void heapifyextract(int index)
{
  int left = index *2;
  int right = (index*2)+1;
  int smallestchild= 0;

  if(sizeoftree<left)
  {
    return;
  }
  else if(sizeoftree == left)
  {
    if(arr[index]> arr[left])
    {
      int temp = arr[index];
      arr[index]= arr[left];
      arr[left]= temp;

    }
    return;
  }
  else
  {
    if(arr[left]<arr[right])
      smallestchild = left;
    else
      smallestchild= right;

    if(arr[index]>arr[smallestchild])
    {
      int temp = arr[index];
      arr[index]= arr[smallestchild];
      arr[smallestchild]= temp;
    }
  }
  heapifyextract(smallestchild);

}



  }
