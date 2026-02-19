package coreJava;


import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,3,4,5};
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

    }
}
