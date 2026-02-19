package org.example;
import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int x = map.get(ch);
                x++;
                map.put(ch, x);

            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                break;
            }
        }
    }
}
