package Day1;

public class Part2 {

    private static String currentNum = "";
    private static int calCount = 0;
    private static int[] board = {0, 0, 0};
    private static String test = "1000\n" + //
                "2000\n" + //
                "3000\n" + //
                "\n" + //
                "4000\n" + //
                "\n" + //
                "5000\n" + //
                "6000\n" + //
                "\n" + //
                "7000\n" + //
                "8000\n" + //
                "9000\n" + //
                "\n" + //
                "10000";

    public static void main(String args[]) {
        int total = 0;
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) != '\n') {
                currentNum += test.charAt(i);
            } else if (currentNum != "") {
                int Count = Integer.parseInt(currentNum);
                calCount += Count;
                currentNum = "";
            } else {
                changeBoard(calCount);
                calCount = 0;
            }
        }

        System.out.println(board[2] + ", " + board[1] + ", " + board[0]);

        for (int i = 0; i < board.length; i++){
            total += board[i];
        }

        System.out.println(total);
    }

    public static int checkBoard(int Count) {
        for (int i = 2; i > 0; i--) {
            if (board[i] < Count) {
                return i;
            }
        }
        return -1;
    }

    public static void changeBoard(int Count) {
        for (int i = 2; i > 0; i--) {
            if (board[i] < Count) {
                if (i == 0) {
                    board[i] = Count;
                } else if (i == 1) {
                    board[i-1] = board[i];
                    board[i] = Count;
                } else {
                    board[i-2] = board[i-1];
                    board[i-1] = board[i];
                    board[i] = Count;
                }
            }
        }
    }
}
