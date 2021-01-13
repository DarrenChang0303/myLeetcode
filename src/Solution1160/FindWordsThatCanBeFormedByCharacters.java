package Solution1160;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {

//TODO: Use List, map.clean to reduce time and space.

    public int countCharacters(String[] words, String chars) {
        int count = 0;

        HashMap<Character, Integer> charsMap = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length(); i++) {
            if (charsMap.containsKey(chars.charAt(i))) {
                charsMap.put(chars.charAt(i), charsMap.get(chars.charAt(i)) + 1);
            } else {
                charsMap.put(chars.charAt(i), 1);
            }
        }

        for (int i = 0; i < words.length; i++) {
            int temp = 0;
            HashMap<Character, Integer> charsMapTemp = new HashMap<Character, Integer>();
            charsMapTemp.putAll(charsMap);

            for (int j = 0; j < words[i].length(); j++) {
                if (charsMapTemp.containsKey(words[i].charAt(j)) && charsMapTemp.get(words[i].charAt(j)) > 0) {
                    charsMapTemp.put(words[i].charAt(j), charsMapTemp.get(words[i].charAt(j)) - 1);
                    temp++;
                }

            }
            if (temp == words[i].length()) {
                count += temp;
            }

        }
        return count;

    }

    public static void main(String[] args) {

        FindWordsThatCanBeFormedByCharacters test = new FindWordsThatCanBeFormedByCharacters();

        String[] words = new String[] {

                "boygirdlggnh",

                "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo" };
        String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";

        System.out.println(test.countCharacters(words, chars));

    }

}
