// using Sorting

import java.util.Arrays;

class NaiveSorting {
    
    // function to find the second largest element
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }
}
