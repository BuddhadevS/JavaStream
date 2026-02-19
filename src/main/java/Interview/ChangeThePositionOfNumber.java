package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeThePositionOfNumber {
    public static void main(String[] args) {
        //left all zero element
        int arr[] = {0,1,3,4,0,2,0,3,0};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==0 && arr[j] !=0){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
