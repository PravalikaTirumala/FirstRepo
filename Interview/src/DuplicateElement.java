/*
duplicate numbers between 1 to N numbers , it works only when the given numbers are from 1 to n
and only 1 number is repeated. it should start from 1 or end with 1

*/
import java.util.*;
public class DuplicateElement{

     public static void main(String []args){
       
       List<Integer> numbers = new ArrayList<>();
      
           numbers.add(5);
           numbers.add(4);
            numbers.add(4);
           numbers.add(3);
            numbers.add(2);
           numbers.add(1);
           
        System.out.println("duplicate numbers is"+ DuplicateElement.duplicate(numbers));
     }
     
     public static int duplicate(List<Integer> list1){
        int hnum = list1.size()-1;
        int total=0;
        for(int i:list1)
            total = total + i ;
         //sum of numbers - sum of n natural numbers (total - n(n+1)/2)   
        int duplicate = total - (hnum*(hnum+1)/2);
       return duplicate;
     }
}