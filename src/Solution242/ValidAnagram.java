package Solution242;

import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        boolean result = true;
        HashMap<Character, Integer> mapS = new HashMap<>();
        if (s.length() != t.length()) {
            result = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (!mapS.containsKey(s.charAt(i))) {
                    mapS.put(s.charAt(i), 1);
                } else {
                    mapS.put(s.charAt(i), mapS.get(s.charAt(i)) + 1);
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (mapS.containsKey(t.charAt(i))) {
                    mapS.put(t.charAt(i), mapS.get(t.charAt(i)) - 1);
                    if (mapS.get(t.charAt(i)) < 0) {
                        result = false;
                        break;
                    }
                }
            }
            Set<Character> set = mapS.keySet();
            for (Character word : set) {
                if (mapS.get(word) > 0) {
                    result = false;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ValidAnagram test = new ValidAnagram();
        String A = "a";
        String B = "ab";

        System.out.println(test.isAnagram(A, B));
        
    }

}
