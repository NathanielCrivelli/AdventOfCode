package Day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Part1 {
    private static String test = "vJrwpWtwJgWrhcsFMMfFFhFp\n" + //
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n" + //
            "PmmdzqPrVvPwwTWBwg\n" + //
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n" + //
            "ttgJtRGJQctTZtZT\n" + //
            "CrZsJsPPZsGzwwsLwLmpwMDw";
    private static String current = "";
    private static int ans = 0;
    private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String args[]) {
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) != '\n') {
                current += test.charAt(i);
            } else {
                ans += priorityAdd(current);
                current = "";
            }
        }

        ans += priorityAdd(current);

        System.out.println(ans);
    }

    public static int priorityAdd(String ruck) {
        String one = ruck.substring(0, ruck.length()/2);
        String two = ruck.substring(ruck.length()/2, ruck.length());
        HashSet<Character> collection = new HashSet<>();
        int total = 0;
        String letters = "";

        for (int i = 0; i < one.length()-1; i++) {
            collection.add(one.charAt(i));
        }

        for(int i = 0; i < two.length(); i++) {
            if (collection.contains(two.charAt(i)) && letterCheck(two, letters)) {
                total += priorityCheck(two.charAt(i));
                letters += two.charAt(i);
                two = two.substring(1, two.length());
            } else {
                two = two.substring(1, two.length());
            }
        }

        return total;
    }

    public static boolean letterCheck(String string, String check) {
        boolean torf = true;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < check.length(); j++) {
                if (string.indexOf(check.charAt(i)) != -1) {
                    torf = true;
                } else {
                    torf = false;
                }
            }
        }
        return torf;
    }

    public static int priorityCheck(char letter) {
        int value = (int) letter;
        if (value > 90) {
            value -= 96;
        } else {
            value -= 38;
        }
        return value;
        // for (int i = 0; i < alphabet.length(); i++) {
        //     if (letter == alphabet.charAt(i)) {
        //         return i + 1;
        //     }
        // }
        // return 0;
    }
}
