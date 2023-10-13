package Day4;

public class Part1 {
    protected static String ipt = Input.GetInput4();
    private static String temp = "";
    private static String str1 = "";
    private static String str2 = "";
    private static int currentBegin = 0, currentEnd = -1, counter;

    private static int frontone, fronttwo, backone, backtwo = 0;

    public static void main(String[] args){
        System.out.println("start");
        loopers();
        System.out.println(counter);
    }

    private static void loopers(){
        for (int i=0; i <ipt.length(); i++){

            if(ipt.charAt(i) == '\n'){
                currentBegin = currentEnd+1;
                currentEnd = i;
                temp = ipt.substring(currentBegin, currentEnd);

                makeSubs(temp);

                frontone = Integer.valueOf(str1);
                fronttwo = Integer.valueOf(str2);

                makeSubs(temp);
                
                backone = Integer.valueOf(str1);                
                backtwo = Integer.valueOf(str2);

                counter = (logic())? counter+1 : counter;
            }
        }
    }

    private static boolean logic(){
        if(frontone >= backone && backtwo >= fronttwo){
            return true;
        }
        else if(backone >= frontone && fronttwo >= backtwo){
            return true;
        }

        else if(frontone >= backone && backtwo <= fronttwo && frontone <= backtwo){
            return true;
        }
        else if(backone >= frontone && fronttwo >= backone && backtwo >= fronttwo){
            return true;
        }

        return false;
    }

    private static void makeSubs(String segment){
        str1 = segment.substring(0, segment.indexOf('-'));
        str2 = segment.substring(segment.indexOf('-')+1, segment.indexOf(','));

        temp = segment.substring(segment.indexOf(',')+1, segment.length())+",";
    }
    
}