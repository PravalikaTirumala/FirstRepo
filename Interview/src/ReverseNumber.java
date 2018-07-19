/* Write a program to reverse a number.*/

public class ReverseNumber{
    private static int num = 12345;
    
    public static void main(String[] args){
      System.out.println(revNumber(num));
    }
    
    public static int revNumber(int num){
        int res =0;
        
        while(num !=0){
            res = (res*10) + (num%10);
            num = num/10;
        }
        return res;
    }
}