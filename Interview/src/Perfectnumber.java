/* Write a program to find perfect number or not */
import java.util.*;
public class Perfectnumber{
    private static int num = 27;
    
    public static void main(String[] args){
    System.out.println( perfectNum(num));
    }
    
    public static String perfectNum(int num){
        String res="";
        int sum=0;
        
        
        if (num ==0)
            res="null";
        else if (num >=1 && num<6)
              res= "not a perfect  number";
        else{
            for(int i=1;i<=num/2;i++){
                if(num%i ==0){
                   sum = sum+i;
                }
            }
            
            if(sum == num){
                if ((sum+num)/2 == num)
                 res= "is a perfect number";  
            }
            else
                  res= "not a perfect  number";  
        }
        return res;
    }
}