// Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.


import java.util.Arrays;

class zero {

    static void zero(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        zero(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}