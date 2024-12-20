// finding largest and then second largest element; in two passes

class TwoPassSearch {
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        //  second largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}
