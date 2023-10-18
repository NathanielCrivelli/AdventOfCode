package Day5;

import java.util.ArrayList;
import java.util.Stack;

public class Part1 {   
    private static String testboard = "    [D]    \n" + //
            "[N] [C]    \n" + //
            "[Z] [M] [P]";
    private static String testcommand = "move 1 from 2 to 1\n" + //
            "move 3 from 1 to 3\n" + //
            "move 2 from 2 to 1\n" + //
            "move 1 from 1 to 2";
    private static ArrayList<Stack> arr = new ArrayList<>();
    private static int row = 0;
    private static int count;
    private static int ogPos;
    private static int newPos;
    public static void main(String args[]) {
        int i = testboard.length() -2;
        for (;i > 0; i--) {
            if (testboard.charAt(i) == '\n') {
                break;
            }
            if (testboard.charAt(i+1) == ']' && testboard.charAt(i-1) == '[') {
                arr.add(0, new Stack<Character>());
                arr.get(0).push(testboard.charAt(i));
            }
        }
        i--;
        int s = arr.size() -1; //counter for what column
        int c = 0; //counter to check if empty space
        for (; i > 0; i--) {
            if (testboard.charAt(i+1) == ']' && testboard.charAt(i-1) == '[') {
                System.out.println(testboard.charAt(i) + Integer.toString(s));
                arr.get(s).push(testboard.charAt(i));
                c = 0;
                s--;
            } else if (c == 3) {
                c = 0;
                s--;
            } else if (testboard.charAt(i) == '\n') {
                s = 2;
            } else {
                c++;
            }
        }

        for (int j = testcommand.length(); j > 0; j--) {
            if (testcommand.charAt(i) == '\n') {
                String current = testcommand.substring(j-18, j);
                if (current.charAt(5) != ' ') {
                    count = Integer.parseInt(current.substring(4,6));
                    ogPos = Integer.parseInt(current.substring(13,14));
                    newPos = Integer.parseInt(current.substring(18,19));
                    System.out.println(count + ogPos + newPos);
                } else {
                    count = Integer.parseInt(current.substring(4,5));
                    ogPos = Integer.parseInt(current.substring(12, 13));
                    newPos = Integer.parseInt(current.substring(17, 18));
                    System.out.println(count + ogPos + newPos);
                }
            }
            arrChange(count, ogPos, newPos);
        }

        for (int o = 0; o < arr.size(); o++) {
            System.out.println(arr.get(o).peek() + " S");
        }
    }

    public static void arrChange(int count, int old, int newP) {
        for (; count > 0; count--) {
            Object top = arr.get(old).peek();

            arr.get(newP).push(top);
            arr.get(old).pop();
        }
    }
}
