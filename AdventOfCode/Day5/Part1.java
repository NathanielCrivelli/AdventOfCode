package Day5;

import java.util.ArrayList;

public class Part1 {
    private static String testboard = "    [D]    \n" + //
            "[N] [C]    \n" + //
            "[Z] [M] [P]\n" + //
            " 1   2   3 ";
    private static String testcommand = "move 1 from 2 to 1\n" + //
            "move 3 from 1 to 3\n" + //
            "move 2 from 2 to 1\n" + //
            "move 1 from 1 to 2";
    private static ArrayList[] arr = new ArrayList[3];
    private static String current = "";
    private static int row = 0;
    private static String count = "";
    public static void main(String args[]) {
        for (int i = 1; i < testboard.length(); i++) {
            if (testboard.charAt(i-1) == '[' && testboard.charAt(i+1) == ']') {
                if (testboard.charAt(i) == ' ' || testboard.charAt(i) == '[' || testboard.charAt(i) == ']') {
                    row++;
                } else if (testboard.charAt(i) == '\n') {
                    row = 0;
                } else {
                    arr[arrCheck(row)].add(testboard.charAt(i));
                }
            }
        }
        
        row = 0;
        for (int i = 0; i < testcommand.length(); i++) {
            if (row == 5 && testcommand.charAt(i+1) != ' ') {
                count += testcommand.charAt(i);
            }
        }
    }

    public static int arrCheck(int space) {
        if (space == 1) {
            return 0;
        } else if (space == 4) {
            return 1;
        } else if (space == 9) {
            return 2;
        }
        return -1;
    }
}
