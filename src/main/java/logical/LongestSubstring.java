package logical;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

            public int lengthOfLongestSubstring(String s) {

                Set<Character> charSet = new HashSet<>();
                int left = 0;
                int maxLength = 0;

                for(int right = 0; right < s.length(); right++) {

                    // If duplicate found, shrink window
                    while(charSet.contains(s.charAt(right))) {
                        charSet.remove(s.charAt(left));
                        left++;
                    }

                    // Add current character
                    charSet.add(s.charAt(right));

                    // Update max length
                    maxLength = Math.max(maxLength, right - left + 1);
                }

                return maxLength;
            }

            // Main Method
            public static void main(String[] args) {

                LongestSubstring sol = new LongestSubstring();

                String input = "pwwkew";

                int result = sol.lengthOfLongestSubstring(input);

                System.out.println("Input: " + input);
                System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
            }
        }
