package com.tek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Sri {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        //Output: [1,2]
//        for(int i=0; i<arr.length;i++){
//            for(int j=i+1; j<arr.length;j++){
//                if(arr[i] + arr[j]==target){
//                    System.out.println((i+1)+" "+(j+1));
//                }
//            }
//        }

        //2 pinter apporach
        int first = arr[0];
        int last = arr[arr.length-1];
        while(arr[arr.length-1]<last){
            arr[arr.length-1]=arr[arr.length-1];
        }







    }
}
