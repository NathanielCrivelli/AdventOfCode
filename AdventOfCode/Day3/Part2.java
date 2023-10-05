package Day3;

public class Part2 {
    private static String test = "vJrwpWtwJgWrhcsFMMfFFhFp\n" + //
    "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n" + //
    "PmmdzqPrVvPwwTWBwg\n" + //
    "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n" + //
    "ttgJtRGJQctTZtZT\n" + //
    "CrZsJsPPZsGzwwsLwLmpwMDw";

    private static String current = ""; //current rucksack
    private static int nlc = 0; //new line count
    private static int ans = 0; //answer to problem
    private static String[] currentgroup = new String[3];
    public static void main(String args[]) {
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == '\n' && nlc == 3) {
                nlc = 0;
            } else if (test.charAt(i) == '\n' && nlc != 3) {
                nlc += 1;
            } else if (test.charAt(i) != '\n') {
                current += test.charAt(i);
            }
        }
    }

    public static void groupSet(String[] group, String current) {}

    public static int 
}
