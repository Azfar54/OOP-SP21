package lab9_assign2;
import java.util.*;

public class CustomStringTokenizer {
    public static int countTokens(StringTokenizer s){
        int count=s.countTokens(), finalCount=0;
        String temp;
        double value;
        boolean flag;
        for(int i=0;i<count;i++){
            flag=true;
            temp=s.nextToken();
            //check if the current token is a numeric value
            try{
                value = Double.parseDouble(temp);
            }
            catch(NumberFormatException e){
                flag=false;
            }
            //counting value only if it is numeric
            if(!flag)
                finalCount++;
        }
        return finalCount;
}
}