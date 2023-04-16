import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String[] words = new String[]{"мама", "hello word", "папа", "їж їжак желе"};

        List <String> helpList = new ArrayList <String> ();

        for (String word : words) {
            char[] chars = word.toCharArray();

            Map <Character, Integer> charsMap = new HashMap <Character, Integer> ();

            for (Character helpChar : chars) {
                if (charsMap.containsKey(helpChar)) {
                    Integer value = charsMap.get(helpChar) + 1;
                    charsMap.put(helpChar, value);
                } else {
                    charsMap.put(helpChar, 1);
                }
            }
            int counter = 0;

            for (Character key : charsMap.keySet()) {
                if (charsMap.get(key) % 2 != 0) {
                    break;
                } else {
                    counter++;
                }
            }

            if (counter != charsMap.keySet().size()){
                continue;
            }
            helpList.add(word);
            if (helpList.size() >=2){
                break;
            }
        }

        Set <Character> mySet = new HashSet <Character> ();

        for (String word: helpList) {
            for (Character character : word.toCharArray()) {
                mySet.add(character);
            }
        }
        System.out.println(mySet);
    }
}