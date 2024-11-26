// keeping track of both largest and second largest in one pass

import java.util.Arrays;

class OnePassSearch {
    
    // second largest
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int l = -1, sl = -1;

        for (int i = 0; i < n; i++) {

            if(arr[i] > l) {
                sl = l;
                l = arr[i];
            }
          
            else if(arr[i] < l && arr[i] > sl) {
                sl = arr[i];
            }
        }
        return sl;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}
