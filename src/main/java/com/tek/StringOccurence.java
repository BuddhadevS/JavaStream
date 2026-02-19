package com.tek;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurence {
    public static void main(String[] args) {
        String s ="aabccccccaaa";
        StringBuilder result = new StringBuilder();

        int count = 1;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                result.append(s.charAt(i)).append(count);
                count = 1;
            }
        }


        result.append(s.charAt(s.length()-1)).append(count);

        System.out.println(result.toString());

    }
}
