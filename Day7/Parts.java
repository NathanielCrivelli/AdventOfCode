package Day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parts {
    private static String inpt = Input.testInput();
    private static int currentBegin = 0, currentEnd = -1; 

    private static ArrayList<ArrayList<String>> dirsInDir = new ArrayList<ArrayList<String>>();
    private static Map<String, Integer> dirSize = new HashMap<String, Integer>();

    private static String currentLine = "";

    public static void main(String args[]){
        eventLoop();
    }

    private static void eventLoop(){
        for (int i=0; i <inpt.length(); i++){
            if(inpt.charAt(i) == '\n'){
                currentBegin = currentEnd+1;
                currentEnd = i;
                currentLine = inpt.substring(currentBegin, currentEnd);
            }
        }
    }
}

