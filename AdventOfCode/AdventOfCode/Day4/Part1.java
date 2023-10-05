package Day4;

public class Part1 {
    protected static final String ipt = Input.GetInput4();
    private static String temp = "";
    private static int currentBegin = 0, currentEnd = -1;

    private static int[][] arr = new int[2][2];

    public static void main(String[] args){
        System.out.println("start");
        loopers();
    }

    private static void loopers(){
        for (int i=0; i <ipt.length(); i++){

            if(ipt.charAt(i) == '\n'){
                currentBegin = currentEnd+1;
                currentEnd = i;
                temp = ipt.substring(currentBegin, currentEnd);
                System.out.println(temp);
                makeSubs(temp);
            }
        }
    }

    private static void makeSubs(String segment){
        segment.replace(',', '\n');
        segment.replace('-', '\n');
        
        int previous=0;
        
        for (int i=0; i<segment.length(); i++){

            if(segment.charAt(i) == '\n'){
                temp = segment.substring(previous, i);
                arr[0][0] = getInts(temp);
                System.out.println(arr[0][0]);
                previous=i+1;
            }
        }

    }

    private static int getInts(String segmentSegment){
        return Integer.parseInt(segmentSegment);
    }
}
