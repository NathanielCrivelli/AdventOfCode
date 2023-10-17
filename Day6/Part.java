package Day6;

import java.util.HashMap;
import java.util.Map;

public class Parts {

    private static Map<Character, Integer> map= new HashMap<Character, Integer>();

    private static String sub = "";

    private static int IMPORTANTNUMBER = 14, answer = 0;

    private static String inpt = Input.getInput6();
    public static void main(String args[]){
        loopthru();
        System.out.println(answer+IMPORTANTNUMBER);
    }

    private static void loopthru(){
        for(int i=0; i < inpt.length()-IMPORTANTNUMBER; i++){
            sub = inpt.substring(i, i+IMPORTANTNUMBER);
            makeHash(sub);

            if(map.size() >= IMPORTANTNUMBER){
                answer = i;
                break;
            }
        }
    }

    private static void makeHash(String s){
        map.clear();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    }
}
