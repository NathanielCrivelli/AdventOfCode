package Day5;

import java.util.ArrayList;

public class Part1 {
    private static String testcommand = "move 1 from 2 to 1\n" + //
            "move 3 from 1 to 3\n" + //
            "move 2 from 2 to 1\n" + //
            "move 1 from 1 to 2";
    private static ArrayList[] arr = new ArrayList[3];
    private static int row = 0;
    private static String count = "";
    private static int ogPos;
    private static int newPos;
    public static void main(String args[]) {
        row = 0;
        for (int i = 0; i < testcommand.length(); i++) {
            if (row == 5 && testcommand.charAt(i+1) != ' ') {
                count += testcommand.charAt(i);
            } else if (row == 5 && testcommand.charAt(i+1) == ' ') {
                count += testcommand.charAt(i);
                row++;
            } else if (row == 11) {
                ogPos = testcommand.charAt(i);
            } else if (row == 14) {
                newPos = testcommand.charAt(i);
            } else if (testcommand.charAt(i) == '\n') {
                row = 0;
                newPos = 0;
                ogPos = 0;
            } else {
                row++;
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

    public static void arrChange(ArrayList<Character>[] arr, int count, int old, int newP) {
        String charsFromArr = "";
        for(int i = 0; i < count; i++) {
            charsFromArr += arr[old].get(arr[old].size());
            arr[old].remove(arr[old].size());
        }
    }

    public static void boardMake(ArrayList<Character>[] arr) {
        arr[0].add('Q');
        arr[0].add('W');
        arr[0].add('P');
        arr[0].add('S');
        arr[0].add('Z');
        arr[0].add('R');
        arr[0].add('H');
        arr[0].add('D');

        arr[1].add('V');
        arr[1].add('B');
        arr[1].add('R');
        arr[1].add('W');
        arr[1].add('Q');
        arr[1].add('H');
        arr[1].add('F');
        
        arr[2].add('C');
        arr[2].add('V');
        arr[2].add('S');
        arr[2].add('H');
        
        arr[3].add('H');
        arr[3].add('F');
        arr[3].add('G');

        arr[4].add('P');
        arr[4].add('G');
        arr[4].add('J');
        arr[4].add('B');
        arr[4].add('Z');

        arr[5].add('Q');
        arr[5].add('T');
        arr[5].add('J');
        arr[5].add('H');
        arr[5].add('W');
        arr[5].add('F');
        arr[5].add('L');

        arr[6].add('Z');
        arr[6].add('T');
        arr[6].add('W');
        arr[6].add('D');
        arr[6].add('L');
        arr[6].add('V');
        arr[6].add('J');
        arr[6].add('N');

        arr[7].add('D');
        arr[7].add('T');
        arr[7].add('Z');
        arr[7].add('C');
        arr[7].add('J');
        arr[7].add('G');
        arr[7].add('H');
        arr[7].add('F');

        arr[8].add('W');
        arr[8].add('P');
        arr[8].add('V');
        arr[8].add('M');
        arr[8].add('B');
        arr[8].add('H');
    }
}
