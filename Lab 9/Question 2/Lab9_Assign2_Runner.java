package lab9_assign2;

import java.util.*;
import static lab9_assign2.CustomStringTokenizer.countTokens;

public class Lab9_Assign2_Runner {

    public static void main(String[] args) {
        //creating 2 StringTokenizers in which one is with and the other is without numeric value
        StringTokenizer s1 = new StringTokenizer("There are thirty four students in this class");
        StringTokenizer s2 = new StringTokenizer("There are 34 students in this class");
                // Counting tokens of each and printing the result
        int count = countTokens(s1);
        System.out.println("The total number of Tokens in string 1: "+ count);
        count = countTokens(s2);
        System.out.println("The total number of Tokens in string 2: "+ count);
        }
    }