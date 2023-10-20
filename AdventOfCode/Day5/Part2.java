package Day5;

import java.util.ArrayList;
import java.util.Stack;

public class Part2 {
    private static String testcommand = "move 1 from 3 to 9\n" + //
            "move 2 from 2 to 1\n" + //
            "move 3 from 5 to 4\n" + //
            "move 1 from 1 to 8\n" + //
            "move 1 from 3 to 9\n" + //
            "move 1 from 5 to 7\n" + //
            "move 1 from 5 to 3\n" + //
            "move 4 from 4 to 2\n" + //
            "move 2 from 3 to 4\n" + //
            "move 1 from 3 to 2\n" + //
            "move 6 from 1 to 5\n" + //
            "move 1 from 4 to 3\n" + //
            "move 1 from 3 to 9\n" + //
            "move 4 from 2 to 4\n" + //
            "move 4 from 8 to 7\n" + //
            "move 3 from 2 to 6\n" + //
            "move 1 from 2 to 7\n" + //
            "move 5 from 5 to 6\n" + //
            "move 1 from 5 to 8\n" + //
            "move 5 from 8 to 7\n" + //
            "move 7 from 4 to 6\n" + //
            "move 15 from 6 to 4\n" + //
            "move 1 from 8 to 7\n" + //
            "move 1 from 1 to 5\n" + //
            "move 1 from 2 to 4\n" + //
            "move 2 from 4 to 8\n" + //
            "move 1 from 5 to 2\n" + //
            "move 5 from 6 to 4\n" + //
            "move 2 from 2 to 1\n" + //
            "move 1 from 9 to 4\n" + //
            "move 1 from 6 to 9\n" + //
            "move 3 from 9 to 3\n" + //
            "move 3 from 4 to 3\n" + //
            "move 1 from 6 to 1\n" + //
            "move 5 from 3 to 4\n" + //
            "move 2 from 8 to 5\n" + //
            "move 1 from 3 to 6\n" + //
            "move 1 from 6 to 2\n" + //
            "move 1 from 2 to 8\n" + //
            "move 6 from 4 to 2\n" + //
            "move 1 from 2 to 7\n" + //
            "move 1 from 5 to 3\n" + //
            "move 4 from 9 to 3\n" + //
            "move 1 from 9 to 1\n" + //
            "move 3 from 1 to 6\n" + //
            "move 1 from 9 to 7\n" + //
            "move 14 from 7 to 6\n" + //
            "move 1 from 8 to 3\n" + //
            "move 4 from 2 to 6\n" + //
            "move 3 from 3 to 8\n" + //
            "move 9 from 4 to 9\n" + //
            "move 1 from 1 to 5\n" + //
            "move 2 from 5 to 8\n" + //
            "move 3 from 8 to 2\n" + //
            "move 4 from 2 to 6\n" + //
            "move 1 from 3 to 9\n" + //
            "move 10 from 6 to 1\n" + //
            "move 5 from 9 to 8\n" + //
            "move 1 from 9 to 3\n" + //
            "move 6 from 1 to 8\n" + //
            "move 3 from 7 to 4\n" + //
            "move 2 from 4 to 5\n" + //
            "move 2 from 9 to 8\n" + //
            "move 15 from 8 to 3\n" + //
            "move 3 from 7 to 9\n" + //
            "move 8 from 4 to 3\n" + //
            "move 2 from 5 to 9\n" + //
            "move 6 from 6 to 5\n" + //
            "move 6 from 5 to 8\n" + //
            "move 1 from 7 to 8\n" + //
            "move 6 from 9 to 2\n" + //
            "move 5 from 2 to 4\n" + //
            "move 6 from 3 to 5\n" + //
            "move 5 from 5 to 8\n" + //
            "move 1 from 5 to 7\n" + //
            "move 1 from 9 to 7\n" + //
            "move 2 from 6 to 4\n" + //
            "move 12 from 8 to 2\n" + //
            "move 7 from 2 to 4\n" + //
            "move 3 from 7 to 5\n" + //
            "move 3 from 5 to 7\n" + //
            "move 3 from 7 to 9\n" + //
            "move 2 from 9 to 7\n" + //
            "move 1 from 9 to 3\n" + //
            "move 2 from 7 to 4\n" + //
            "move 3 from 1 to 9\n" + //
            "move 4 from 6 to 5\n" + //
            "move 6 from 2 to 8\n" + //
            "move 14 from 4 to 9\n" + //
            "move 7 from 9 to 6\n" + //
            "move 9 from 9 to 2\n" + //
            "move 1 from 5 to 8\n" + //
            "move 5 from 6 to 3\n" + //
            "move 3 from 1 to 9\n" + //
            "move 3 from 8 to 9\n" + //
            "move 1 from 8 to 3\n" + //
            "move 5 from 2 to 5\n" + //
            "move 1 from 4 to 9\n" + //
            "move 2 from 6 to 1\n" + //
            "move 2 from 3 to 6\n" + //
            "move 3 from 8 to 3\n" + //
            "move 2 from 6 to 3\n" + //
            "move 1 from 4 to 9\n" + //
            "move 4 from 3 to 6\n" + //
            "move 7 from 6 to 9\n" + //
            "move 10 from 9 to 2\n" + //
            "move 10 from 3 to 2\n" + //
            "move 7 from 2 to 8\n" + //
            "move 2 from 1 to 7\n" + //
            "move 13 from 3 to 7\n" + //
            "move 7 from 5 to 1\n" + //
            "move 1 from 9 to 6\n" + //
            "move 4 from 8 to 4\n" + //
            "move 2 from 3 to 2\n" + //
            "move 4 from 4 to 6\n" + //
            "move 1 from 3 to 4\n" + //
            "move 5 from 6 to 5\n" + //
            "move 3 from 5 to 7\n" + //
            "move 12 from 2 to 5\n" + //
            "move 7 from 5 to 6\n" + //
            "move 2 from 8 to 3\n" + //
            "move 7 from 6 to 2\n" + //
            "move 3 from 9 to 6\n" + //
            "move 1 from 6 to 7\n" + //
            "move 1 from 4 to 9\n" + //
            "move 2 from 7 to 6\n" + //
            "move 13 from 7 to 4\n" + //
            "move 3 from 7 to 5\n" + //
            "move 1 from 9 to 6\n" + //
            "move 12 from 4 to 3\n" + //
            "move 1 from 8 to 1\n" + //
            "move 2 from 6 to 4\n" + //
            "move 1 from 7 to 9\n" + //
            "move 2 from 9 to 8\n" + //
            "move 12 from 3 to 5\n" + //
            "move 1 from 8 to 2\n" + //
            "move 15 from 5 to 6\n" + //
            "move 2 from 4 to 6\n" + //
            "move 1 from 9 to 6\n" + //
            "move 5 from 5 to 4\n" + //
            "move 4 from 4 to 2\n" + //
            "move 2 from 1 to 5\n" + //
            "move 4 from 1 to 5\n" + //
            "move 1 from 8 to 6\n" + //
            "move 7 from 5 to 2\n" + //
            "move 22 from 2 to 3\n" + //
            "move 9 from 6 to 3\n" + //
            "move 1 from 1 to 8\n" + //
            "move 1 from 8 to 7\n" + //
            "move 23 from 3 to 6\n" + //
            "move 2 from 2 to 4\n" + //
            "move 1 from 7 to 8\n" + //
            "move 1 from 8 to 2\n" + //
            "move 19 from 6 to 9\n" + //
            "move 2 from 2 to 4\n" + //
            "move 4 from 4 to 6\n" + //
            "move 13 from 6 to 8\n" + //
            "move 12 from 9 to 1\n" + //
            "move 2 from 5 to 9\n" + //
            "move 2 from 4 to 8\n" + //
            "move 1 from 2 to 7\n" + //
            "move 1 from 7 to 1\n" + //
            "move 4 from 6 to 2\n" + //
            "move 10 from 1 to 9\n" + //
            "move 1 from 6 to 7\n" + //
            "move 11 from 8 to 2\n" + //
            "move 6 from 3 to 6\n" + //
            "move 1 from 7 to 2\n" + //
            "move 1 from 1 to 8\n" + //
            "move 2 from 6 to 7\n" + //
            "move 7 from 6 to 3\n" + //
            "move 9 from 3 to 1\n" + //
            "move 7 from 9 to 6\n" + //
            "move 1 from 8 to 7\n" + //
            "move 4 from 2 to 6\n" + //
            "move 1 from 8 to 3\n" + //
            "move 6 from 6 to 5\n" + //
            "move 9 from 9 to 3\n" + //
            "move 5 from 6 to 1\n" + //
            "move 1 from 7 to 8\n" + //
            "move 2 from 8 to 4\n" + //
            "move 1 from 4 to 2\n" + //
            "move 1 from 4 to 5\n" + //
            "move 2 from 5 to 6\n" + //
            "move 1 from 6 to 9\n" + //
            "move 9 from 1 to 4\n" + //
            "move 4 from 4 to 6\n" + //
            "move 2 from 4 to 7\n" + //
            "move 7 from 2 to 8\n" + //
            "move 5 from 6 to 7\n" + //
            "move 6 from 3 to 8\n" + //
            "move 8 from 1 to 9\n" + //
            "move 3 from 5 to 2\n" + //
            "move 2 from 3 to 9\n" + //
            "move 3 from 9 to 4\n" + //
            "move 7 from 2 to 3\n" + //
            "move 1 from 7 to 2\n" + //
            "move 10 from 3 to 2\n" + //
            "move 6 from 9 to 4\n" + //
            "move 1 from 3 to 1\n" + //
            "move 1 from 1 to 8\n" + //
            "move 4 from 8 to 5\n" + //
            "move 10 from 8 to 4\n" + //
            "move 2 from 8 to 9\n" + //
            "move 7 from 4 to 9\n" + //
            "move 6 from 2 to 6\n" + //
            "move 3 from 6 to 5\n" + //
            "move 4 from 4 to 9\n" + //
            "move 8 from 7 to 5\n" + //
            "move 1 from 9 to 2\n" + //
            "move 7 from 2 to 1\n" + //
            "move 4 from 9 to 8\n" + //
            "move 2 from 6 to 3\n" + //
            "move 2 from 3 to 2\n" + //
            "move 13 from 5 to 7\n" + //
            "move 5 from 4 to 9\n" + //
            "move 5 from 1 to 7\n" + //
            "move 3 from 5 to 8\n" + //
            "move 17 from 7 to 2\n" + //
            "move 15 from 2 to 6\n" + //
            "move 15 from 9 to 5\n" + //
            "move 1 from 9 to 5\n" + //
            "move 4 from 8 to 6\n" + //
            "move 1 from 4 to 6\n" + //
            "move 5 from 4 to 7\n" + //
            "move 5 from 2 to 7\n" + //
            "move 18 from 6 to 2\n" + //
            "move 2 from 7 to 6\n" + //
            "move 10 from 2 to 8\n" + //
            "move 2 from 2 to 3\n" + //
            "move 11 from 8 to 7\n" + //
            "move 7 from 7 to 5\n" + //
            "move 9 from 7 to 5\n" + //
            "move 3 from 7 to 5\n" + //
            "move 2 from 1 to 7\n" + //
            "move 4 from 2 to 1\n" + //
            "move 30 from 5 to 1\n" + //
            "move 1 from 3 to 1\n" + //
            "move 35 from 1 to 9\n" + //
            "move 2 from 2 to 5\n" + //
            "move 2 from 8 to 3\n" + //
            "move 20 from 9 to 2\n" + //
            "move 3 from 7 to 9\n" + //
            "move 1 from 3 to 6\n" + //
            "move 5 from 5 to 3\n" + //
            "move 18 from 2 to 5\n" + //
            "move 4 from 5 to 8\n" + //
            "move 7 from 9 to 7\n" + //
            "move 1 from 6 to 2\n" + //
            "move 3 from 8 to 5\n" + //
            "move 6 from 3 to 5\n" + //
            "move 3 from 7 to 4\n" + //
            "move 2 from 2 to 3\n" + //
            "move 1 from 4 to 5\n" + //
            "move 2 from 4 to 5\n" + //
            "move 4 from 7 to 2\n" + //
            "move 26 from 5 to 6\n" + //
            "move 2 from 2 to 7\n" + //
            "move 1 from 2 to 9\n" + //
            "move 1 from 7 to 8\n" + //
            "move 1 from 5 to 3\n" + //
            "move 2 from 8 to 3\n" + //
            "move 11 from 9 to 3\n" + //
            "move 6 from 3 to 4\n" + //
            "move 27 from 6 to 4\n" + //
            "move 33 from 4 to 3\n" + //
            "move 4 from 6 to 8\n" + //
            "move 1 from 2 to 8\n" + //
            "move 1 from 7 to 3\n" + //
            "move 4 from 8 to 9\n" + //
            "move 1 from 8 to 6\n" + //
            "move 34 from 3 to 8\n" + //
            "move 1 from 8 to 5\n" + //
            "move 1 from 2 to 9\n" + //
            "move 8 from 3 to 9\n" + //
            "move 3 from 5 to 4\n" + //
            "move 1 from 6 to 5\n" + //
            "move 27 from 8 to 9\n" + //
            "move 1 from 3 to 4\n" + //
            "move 1 from 5 to 7\n" + //
            "move 3 from 8 to 1\n" + //
            "move 11 from 9 to 1\n" + //
            "move 1 from 7 to 5\n" + //
            "move 11 from 9 to 3\n" + //
            "move 1 from 5 to 1\n" + //
            "move 1 from 8 to 7\n" + //
            "move 2 from 9 to 2\n" + //
            "move 1 from 2 to 1\n" + //
            "move 1 from 2 to 7\n" + //
            "move 2 from 8 to 2\n" + //
            "move 6 from 3 to 8\n" + //
            "move 1 from 4 to 2\n" + //
            "move 7 from 1 to 2\n" + //
            "move 1 from 7 to 1\n" + //
            "move 19 from 9 to 1\n" + //
            "move 3 from 2 to 9\n" + //
            "move 10 from 1 to 4\n" + //
            "move 2 from 9 to 1\n" + //
            "move 1 from 7 to 9\n" + //
            "move 7 from 1 to 6\n" + //
            "move 10 from 4 to 3\n" + //
            "move 14 from 1 to 7\n" + //
            "move 2 from 9 to 1\n" + //
            "move 3 from 4 to 6\n" + //
            "move 9 from 7 to 6\n" + //
            "move 1 from 3 to 5\n" + //
            "move 4 from 8 to 5\n" + //
            "move 10 from 6 to 8\n" + //
            "move 3 from 5 to 6\n" + //
            "move 10 from 3 to 4\n" + //
            "move 4 from 3 to 7\n" + //
            "move 1 from 5 to 9\n" + //
            "move 2 from 7 to 9\n" + //
            "move 1 from 1 to 9\n" + //
            "move 6 from 2 to 4\n" + //
            "move 1 from 5 to 3\n" + //
            "move 11 from 4 to 9\n" + //
            "move 3 from 4 to 9\n" + //
            "move 1 from 2 to 7\n" + //
            "move 2 from 3 to 5\n" + //
            "move 1 from 3 to 2\n" + //
            "move 7 from 7 to 2\n" + //
            "move 2 from 5 to 8\n" + //
            "move 8 from 2 to 1\n" + //
            "move 2 from 6 to 8\n" + //
            "move 9 from 6 to 8\n" + //
            "move 3 from 8 to 2\n" + //
            "move 3 from 2 to 6\n" + //
            "move 9 from 9 to 5\n" + //
            "move 3 from 5 to 8\n" + //
            "move 5 from 9 to 4\n" + //
            "move 3 from 6 to 4\n" + //
            "move 1 from 6 to 3\n" + //
            "move 3 from 1 to 6\n" + //
            "move 3 from 6 to 9\n" + //
            "move 17 from 8 to 5\n" + //
            "move 12 from 5 to 4\n" + //
            "move 21 from 4 to 3\n" + //
            "move 1 from 4 to 9\n" + //
            "move 7 from 5 to 4\n" + //
            "move 22 from 3 to 7\n" + //
            "move 3 from 1 to 8\n" + //
            "move 3 from 9 to 1\n" + //
            "move 4 from 4 to 6\n" + //
            "move 1 from 6 to 2\n" + //
            "move 3 from 4 to 1\n" + //
            "move 1 from 6 to 7\n" + //
            "move 4 from 9 to 3\n" + //
            "move 2 from 5 to 7\n" + //
            "move 1 from 9 to 6\n" + //
            "move 2 from 6 to 9\n" + //
            "move 8 from 7 to 9\n" + //
            "move 1 from 6 to 2\n" + //
            "move 1 from 9 to 3\n" + //
            "move 4 from 3 to 4\n" + //
            "move 14 from 7 to 4\n" + //
            "move 1 from 3 to 2\n" + //
            "move 3 from 7 to 8\n" + //
            "move 12 from 8 to 9\n" + //
            "move 8 from 4 to 1\n" + //
            "move 1 from 7 to 4\n" + //
            "move 2 from 5 to 1\n" + //
            "move 3 from 2 to 9\n" + //
            "move 17 from 9 to 3\n" + //
            "move 6 from 9 to 1\n" + //
            "move 1 from 9 to 2\n" + //
            "move 13 from 3 to 9\n" + //
            "move 4 from 3 to 1\n" + //
            "move 3 from 9 to 1\n" + //
            "move 22 from 1 to 9\n" + //
            "move 1 from 8 to 1\n" + //
            "move 6 from 9 to 5\n" + //
            "move 4 from 1 to 9\n" + //
            "move 3 from 1 to 9\n" + //
            "move 4 from 4 to 8\n" + //
            "move 4 from 4 to 2\n" + //
            "move 1 from 4 to 3\n" + //
            "move 3 from 8 to 9\n" + //
            "move 1 from 3 to 4\n" + //
            "move 1 from 1 to 3\n" + //
            "move 1 from 8 to 2\n" + //
            "move 1 from 5 to 8\n" + //
            "move 4 from 2 to 1\n" + //
            "move 1 from 8 to 7\n" + //
            "move 10 from 9 to 6\n" + //
            "move 1 from 7 to 9\n" + //
            "move 1 from 2 to 3\n" + //
            "move 1 from 6 to 1\n" + //
            "move 3 from 5 to 7\n" + //
            "move 1 from 8 to 7\n" + //
            "move 1 from 6 to 1\n" + //
            "move 1 from 2 to 4\n" + //
            "move 1 from 5 to 2\n" + //
            "move 19 from 9 to 2\n" + //
            "move 1 from 4 to 7\n" + //
            "move 1 from 3 to 7\n" + //
            "move 3 from 7 to 9\n" + //
            "move 4 from 1 to 2\n" + //
            "move 10 from 9 to 4\n" + //
            "move 1 from 5 to 8\n" + //
            "move 3 from 6 to 4\n" + //
            "move 1 from 3 to 4\n" + //
            "move 10 from 2 to 8\n" + //
            "move 12 from 2 to 5\n" + //
            "move 3 from 5 to 9\n" + //
            "move 5 from 6 to 5\n" + //
            "move 5 from 1 to 4\n" + //
            "move 22 from 4 to 3\n" + //
            "move 3 from 8 to 7\n" + //
            "move 1 from 7 to 2\n" + //
            "move 3 from 2 to 9\n" + //
            "move 19 from 3 to 5\n" + //
            "move 2 from 7 to 8\n" + //
            "move 7 from 5 to 6\n" + //
            "move 5 from 9 to 6\n" + //
            "move 1 from 9 to 3\n" + //
            "move 16 from 5 to 1\n" + //
            "move 2 from 3 to 1\n" + //
            "move 3 from 7 to 3\n" + //
            "move 7 from 8 to 4\n" + //
            "move 2 from 8 to 1\n" + //
            "move 5 from 5 to 9\n" + //
            "move 1 from 5 to 2\n" + //
            "move 1 from 2 to 3\n" + //
            "move 1 from 8 to 5\n" + //
            "move 4 from 5 to 7\n" + //
            "move 2 from 3 to 8\n" + //
            "move 2 from 1 to 5\n" + //
            "move 4 from 7 to 6\n" + //
            "move 6 from 4 to 7\n" + //
            "move 4 from 9 to 8\n" + //
            "move 14 from 6 to 7\n" + //
            "move 8 from 1 to 7\n" + //
            "move 7 from 1 to 3\n" + //
            "move 3 from 5 to 9\n" + //
            "move 28 from 7 to 5\n" + //
            "move 1 from 1 to 8\n" + //
            "move 4 from 8 to 3\n" + //
            "move 9 from 3 to 1\n" + //
            "move 1 from 9 to 5\n" + //
            "move 6 from 3 to 2\n" + //
            "move 10 from 1 to 6\n" + //
            "move 1 from 1 to 9\n" + //
            "move 5 from 9 to 7\n" + //
            "move 14 from 5 to 3\n" + //
            "move 1 from 4 to 1\n" + //
            "move 1 from 7 to 2\n" + //
            "move 1 from 7 to 1\n" + //
            "move 1 from 1 to 7\n" + //
            "move 3 from 8 to 5\n" + //
            "move 4 from 6 to 3\n" + //
            "move 3 from 7 to 2\n" + //
            "move 15 from 3 to 6\n" + //
            "move 16 from 5 to 7\n" + //
            "move 4 from 2 to 8\n" + //
            "move 1 from 3 to 1\n" + //
            "move 5 from 7 to 3\n" + //
            "move 12 from 6 to 4\n" + //
            "move 4 from 8 to 5\n" + //
            "move 1 from 4 to 2\n" + //
            "move 2 from 5 to 3\n" + //
            "move 8 from 6 to 3\n" + //
            "move 7 from 4 to 5\n" + //
            "move 9 from 7 to 6\n" + //
            "move 1 from 7 to 9\n" + //
            "move 1 from 1 to 9\n" + //
            "move 1 from 1 to 9\n" + //
            "move 5 from 2 to 8\n" + //
            "move 5 from 8 to 2\n" + //
            "move 11 from 5 to 9\n" + //
            "move 1 from 4 to 2\n" + //
            "move 4 from 9 to 6\n" + //
            "move 12 from 3 to 7\n" + //
            "move 3 from 4 to 9\n" + //
            "move 14 from 6 to 2\n" + //
            "move 2 from 2 to 4\n" + //
            "move 2 from 3 to 5\n" + //
            "move 10 from 7 to 2\n" + //
            "move 1 from 4 to 8\n" + //
            "move 1 from 2 to 7\n" + //
            "move 28 from 2 to 9\n" + //
            "move 4 from 7 to 5\n" + //
            "move 1 from 2 to 4\n" + //
            "move 6 from 5 to 1\n" + //
            "move 2 from 4 to 3\n" + //
            "move 1 from 8 to 1\n" + //
            "move 40 from 9 to 1\n" + //
            "move 10 from 1 to 6\n" + //
            "move 5 from 3 to 5\n" + //
            "move 1 from 9 to 8\n" + //
            "move 3 from 6 to 7\n" + //
            "move 11 from 1 to 2\n" + //
            "move 9 from 2 to 3\n" + //
            "move 3 from 5 to 1\n" + //
            "move 4 from 7 to 1\n" + //
            "move 2 from 2 to 4\n" + //
            "move 2 from 5 to 8\n" + //
            "move 19 from 1 to 7\n" + //
            "move 8 from 3 to 2\n" + //
            "move 14 from 1 to 8\n" + //
            "move 14 from 7 to 1\n" + //
            "move 4 from 6 to 5\n" + //
            "move 1 from 1 to 9";
    private static String testboard = "[D]                     [N] [F]    \n" + //
            "[H] [F]             [L] [J] [H]    \n" + //
            "[R] [H]             [F] [V] [G] [H]\n" + //
            "[Z] [Q]         [Z] [W] [L] [J] [B]\n" + //
            "[S] [W] [H]     [B] [H] [D] [C] [M]\n" + //
            "[P] [R] [S] [G] [J] [J] [W] [Z] [V]\n" + //
            "[W] [B] [V] [F] [G] [T] [T] [T] [P]\n" + //
            "[Q] [V] [C] [H] [P] [Q] [Z] [D] [W]";
    private static ArrayList<Stack> arr = new ArrayList<>();
    private static int row = 0;
    private static int count;
    private static int ogPos;
    private static int newPos;
    private static String current = "";
    public static void main(String args[]) {int i = testboard.length() -2;
        for (;i > 0; i--) {
            if (testboard.charAt(i) == '\n') {
                break;
            }
            if (testboard.charAt(i+1) == ']' && testboard.charAt(i-1) == '[') {
                arr.add(0, new Stack<Character>());
                arr.get(0).push(testboard.charAt(i));
                System.out.println(testboard.charAt(i));
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
                s = arr.size() - 1;
            } else {
                c++;
            }
        }
        for (int j = 0; j < testcommand.length(); j++) {
            if (testcommand.charAt(j) != '\n') {
                current += testcommand.charAt(j);
                if (current.equals("move ")) {
                    if (testcommand.charAt(j+2) == ' ') {
                        count = Integer.parseInt(testcommand.substring(j+1, j+2));
                        current = "";
                        j++;
                    } else {
                        count = Integer.parseInt(testcommand.substring(j+1, j+3));
                        current = "";
                        j+=2;
                    }
                } else if (current.equals(" from ")) {
                    ogPos = Integer.parseInt(testcommand.substring(j+1, j+2)) - 1;
                    current = "";
                    j++;
                } else if (current.equals(" to ")) {
                    newPos = Integer.parseInt(testcommand.substring(j+1, j+2)) - 1;
                    current = "";
                    j++;
                    arrChange(count, ogPos, newPos);
                } else if (testcommand.charAt(j) == '\n') {
                    current = "";
                }
            }
        }
        for (int o = 0; o < arr.size(); o++) {
            System.out.print(arr.get(o).peek());
        }
    }

    public static void arrChange(int count, int old, int newP) {
        Stack<Character> stacks = new Stack<>();
        for(int i = 0; i < count; i++) {
            Object top = arr.get(old).peek();
            arr.get(old).pop();
            stacks.push((Character) top);
        }
        for (; count > 0; count--) {
            Object top = stacks.peek();

            arr.get(newP).push(top);
            stacks.pop();
        }
    }
}
