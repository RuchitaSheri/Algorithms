package SearchingAlgo;


/** Search a sorted array by repeatedly dividing the search interval in half.
 *  Begin with an interval covering the whole array.
 *  If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
 *  Otherwise narrow it to the upper half.
 *  Repeatedly check until the value is found or the interval is empty.
 **/
public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {2,3,4,6,7,12,34,45,67};
    int x = 12, leftIndex=0, rightIndex=arr.length-1;
    int index = IterativeSearch(arr,leftIndex,rightIndex,x);
    if (index == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index " + index);
    }
  }

  static int IterativeSearch(int arr[], int low, int high, int ele){
    while(high>=low){
      int mid = low + (high-low)/2;   //for large array size
      if(arr[mid]==ele)        //if element is present at middle index
        return mid;
      else if(ele > arr[mid]) //if element is greater than mid element
        low=mid+1;
      else                   //if element is lower than mid element
        high=mid-1;
    }
    return -1;
  }
}