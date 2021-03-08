package Solution819;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// import java.util.Map;
// import java.util.Map.Entry;

public class MostCommonWord {

    public void mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> wordCollection = new HashMap<>();
        String[] words = new String[] {};
        String regex = "[\\W]";

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll(regex, " ");
        words = paragraph.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            for (String wordBanned : banned) {
                System.out.println(words[i]);
                if (words[i].equals(wordBanned)) {
                    words[i] = "banned";
                }
                System.out.println(words[i]);
            }
        }
        // System.out.println(Arrays.toString(words));

        for (String wordNumber : words) {
            if (wordCollection.containsKey(wordNumber)) {
                wordCollection.put(wordNumber, wordCollection.get(wordNumber) + 1);
            } else if (wordNumber.equals("banned")) {
                wordCollection.put(wordNumber, 0);
            } else {
                wordCollection.put(wordNumber, 1);
            }
        }

        for (Map.Entry<String, Integer> ent : wordCollection.entrySet()) {
            System.out.println("key = ." + ent.getKey() + ". value = " + ent.getValue());
        }

        int maxNumber = 0;
        String ans = "test";
        for (Map.Entry<String, Integer> entry : wordCollection.entrySet()) {
            System.out.println("key = ." + entry.getKey() + ". value = " + entry.getValue());
            if (entry.getValue() > maxNumber) {
                maxNumber = entry.getValue();
                ans = entry.getKey();
                System.out.println("change max=" + maxNumber);
                System.out.println("change ans=" + entry.getKey());
                // maxNumber = entry.getValue();
            }
        }

        System.out.println("abc=" + ans);

        // return ans;
    }

    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = new String[] { "bob", "hit" };
        MostCommonWord test = new MostCommonWord();

        test.mostCommonWord(paragraph, banned);
        // System.out.println(test.mostCommonWord(paragraph, banned));

    }
}
