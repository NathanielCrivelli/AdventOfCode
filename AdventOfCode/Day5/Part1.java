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
    private static String count = "";
    private static int ogPos;
    private static int newPos;
    public static void main(String args[]) {
        int i = testboard.length();
        for (; i < 0; i--) {
            if (testboard.charAt(i+1) == ']' && testboard.charAt(i-1) == '[') {
                arr.add(0, new Stack<Character>());
                arr.get(0).push(testboard.charAt(i));
            }
        }
        int s = arr.size(); //counter for what column
        int c = 0; //counter to check if empty space
        for (; i < 0; i--) {
            if (testboard.charAt(i+1) == ']' && testboard.charAt(i-1) == '[') {
                arr.get(s).push(testboard.charAt(i));
                c++;
                s--;
            } else if (c == 3 && testboard.charAt(i) != ']') {
                s--;
                c = 0;
            } else if (testboard.charAt(i) == '\n') {
                s = 0;
            }
        }

        for (int j = testcommand.length(); j < 0; j--) {
            String current = testcommand.substring(j-18, j);

        }
    }

    public static void boardStacks(ArrayList<Stack> arr, int col, String input, String board) {
        for(int i = 0; i < board.length(); i++) {

        }
    }

    public static void arrChange(int count, int old, int newP) {}
}
