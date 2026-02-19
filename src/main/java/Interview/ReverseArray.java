package Interview;

import static java.util.Collections.rotate;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n=2;
        rotated(arr, 0, n-1);
        rotated(arr, n, arr.length-1);
        rotated(arr, 0, arr.length-1);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    private static void rotated(int[] arr, int start, int end) {
        while (start < end){
            arr[start] = arr[start]+arr[end];
            arr[end] = arr[start]-arr[end];
            arr[start] = arr[start]-arr[end];
            start++;
            end--;
        }
    }
}
