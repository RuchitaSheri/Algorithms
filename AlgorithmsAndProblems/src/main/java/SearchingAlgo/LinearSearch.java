package SearchingAlgo;

import java.util.Scanner;


/** A simple approach is to do linear search, i.e

 Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
 If x matches with an element, return the index.
 If x doesn’t match with any of elements, return -1. **/

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {3,4,5,12,45,67,13,56,13};
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int index = Search(arr,x);
    if (index == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index " + index);
    }
  }

  static int Search(int arr[], int x) {
    for (int i = 0; i < arr.length; i++) {
      if(x==arr[i])
        return i;
    }
    return -1;
  }
}


/** The time complexity of above algorithm is O(n).
 **/