// Java Program to reverse an array using inbuilt methods

import java.util.*;

class reverseArray {
    
    static void reverseArray(List<Integer> arr) {
        Collections.reverse(arr);
    }

    public static void main(String[] args) {
        List<Integer> arr = 
          new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));

        reverseArray(arr);
  
        for (int i = 0; i < arr.size(); i++) 
            System.out.print(arr.get(i) + " ");
    }
}