package logical;
import java.util.*;
public class Maximum_number {
    //2nd max

            public static void main(String[] args) {

                int arr[] = {7, 10, 4, 3, 20, 15};
                int k = 2;

                k = k%arr.length;

                // Sort array in ascending order (manual sort)
                for(int i = 0; i < arr.length; i++){
                    for(int j = i + 1; j < arr.length; j++){
                        if(arr[i] > arr[j]){
                            arr[i] = arr[i]+arr[j];
                            arr[j] = arr[i]-arr[j];
                            arr[i] = arr[i]-arr[j];
                        }
                    }
                }

                // Kth highest
                int result = arr[arr.length - k];

                System.out.println("Kth Highest: " + result);
            }
        }


