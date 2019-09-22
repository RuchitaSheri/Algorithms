package SearchingAlgo;

public class RecursiveBinarySearch {
  public static void main(String[] args) {
    int[] arr = {2,3,4,6,7,12,34,45,67};
    int x = 12, leftIndex=0, rightIndex=arr.length-1;
    int index = RecursiveSearch(arr,leftIndex,rightIndex,x);
    if (index == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index " + index);
    }
  }

  static int RecursiveSearch(int arr[], int low, int high, int ele){
    if(high >= low){
      int mid = low + (high-low)/2;   //element found at middle element
      if(arr[mid]==ele)
        return mid;
      else if(arr[mid] > ele)       //element is smaller than middle element, ignore right half
         return RecursiveSearch(arr,low,mid-1,ele);
      else                            //ignore left half
         return RecursiveSearch(arr,mid+1,high,ele);
    }
    return -1;
  }
}

/** The time complexity of Binary Search can be written as

 T(n) = T(n/2) + c
 The above recurrence can be solved either using Recurrence T ree method or Master method.
 It falls in case II of Master Method and solution of the recurrence is Theta(Logn).

 Auxiliary Space: O(1) in case of iterative implementation.
 In case of recursive implementation, O(Logn) recursion call stack space.
 **/