package com.tek;

public class Find_Maximum_subarray_sum {
        static int maxSubarraySum ( int[] arr){
            int res = arr[0];
            for (int i = 0; i < arr.length; i++) {
                int Sum = 0;
                for (int j = i; j < arr.length; j++) {
                    Sum = Sum + arr[j];
                    res = Math.max(res, Sum);
                }
            }
            return res;
        }

        public static void main (String[]args){
            int[] arr = {2, 3, -8, 7, -1, 2, 3};
            System.out.println(maxSubarraySum(arr));
        }
    }
