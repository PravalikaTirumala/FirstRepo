/* Write a program to convert decimal number to binary format*/
import java.util.*;
public class DecimalTobinary{
    private static int num = 12;
    
    public static void main(String[] args){
    System.out.println( toBinary(num));
    }
    
    public static String toBinary(int num){
        String result ="";
        
        if (num ==0)
           return "0";
        else if (num ==1)
             return "1";
        else{
            while(num >0){
               result = (num%2)+result;
                num = num/2;
            }
        }
        return result;
        
    }
}


