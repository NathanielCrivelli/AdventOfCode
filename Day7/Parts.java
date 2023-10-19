package Day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parts {
    private static String inpt = Input.testInput();
    private static int currentBegin = 0, currentEnd = -1, answer=0, fileSize=0; 

    private static Map<String, ArrayList<String>> dirsInDir = new HashMap<String, ArrayList<String>>();
    private static Map<String, Integer> dirSize = new HashMap<String, Integer>();
    private static ArrayList<String> path = new ArrayList<String>();

    private static String currentLine = "";
    private static String prevDir = "/";
    private static String curDir = "/";

    private static boolean shouldAddInts = false;

    public static void main(String args[]){
        eventLoop();
        testerMethod();
    }

    private static void eventLoop(){
        for (int i=0; i <inpt.length(); i++){
            if(inpt.charAt(i) == '\n'){
                prevDir = curDir;

                currentBegin = currentEnd+1;
                currentEnd = i;
                currentLine = inpt.substring(currentBegin, currentEnd);

                lineLoop(currentLine);
            }
        }
    }
    /* get curdir, add it to dirsInDir and dirSize
     * if file, parseInt and add Integer to dirSize
     * if directory, add to arrayList of dirsInDir
     * ONLY ADD INTS IF LS
     * if new cd, loop through path and
     *      add prevDir's integer to each directory
     * 
     * if cd-ing to '..'
     * remove last element from path and
     *      set curDir to the new last element
     * 
     * if cd-ing to '/'
     * clear path and add a new '/'
    */

    private static void lineLoop(String s){
        for (int i=0; i < s.length() - 1; i++){
            //check for cd
            if(i < s.length()-1 && s.charAt(i) == 'c' && s.charAt(i+1) == 'd'){

                shouldAddInts = false;
                curDir = s.substring(i+3, s.length());

                //cd up
                if (curDir.equals("..")){
                    path.remove(path.size()-1);
                    curDir = path.get(path.size()-1);
                }
                // cd home
                else if (curDir.equals("/")){
                    path.clear();
                    path.add(curDir);
                    dirsInDir.put(curDir, new ArrayList<String>());
                    dirSize.put(curDir, 0);
                }
                else{
                    path.add(curDir);
                    dirSize.put(curDir, 0);
                    dirsInDir.put(curDir, new ArrayList<String>());
                }
            }

            //check for ls
            if(i < s.length()-1 && s.charAt(i) == 'l' && s.charAt(i+1) == 's'){
                shouldAddInts = true;
            }

            //check for dir and add to dirsInDir
            if(i < s.length()-2 && s.charAt(i) == 'd' && s.charAt(i+1) == 'i' && s.charAt(i+2) == 'r'){
                dirsInDir.get(curDir).add(s.substring(i+4, s.length()));
            }

            //check for file
            if(isNumber(s.charAt(i))){
                dirSize.computeIfPresent(curDir, (key, val) -> val + makeInteger(s));
                break;
            }

            //add nums
            if(shouldAddInts && s.charAt(i) == '$'){
                fileSize = dirSize.get(curDir);
                
                for (String string : path) {
                    if(string != curDir){
                        dirSize.computeIfPresent(string, (key, val) -> val + fileSize);
                    }
                }
            }
        }
    }

    private static int makeInteger(String s){
        String composite = "";

        for (int i =0; i<s.length()-1; i++){
            if(!isNumber(s.charAt(i))){
                composite = s.substring(0, i);
                break;
            }
        }

        return Integer.parseInt(composite);
    }

    private static boolean isNumber(char c){
        switch(c){
            case '1':
                return true;
            case '2':
                return true;
            case '3':
                return true;
            case '4':
                return true;
            case '5':
                return true;
            case '6':
                return true;
            case '7':
                return true;
            case '8':
                return true;
            case '9':
                return true;
            case '0':
                return true;
        }
        return false;
    }

    private static void testerMethod(){
        dirSize.forEach((key, val) -> {System.out.println("directory: " + key + "\nSIZE: " + val + "\n");});
    }

    private static void kms(){
        for (String string : path) {
            System.out.println(string + dirSize.get(string));
        }
    }
}
