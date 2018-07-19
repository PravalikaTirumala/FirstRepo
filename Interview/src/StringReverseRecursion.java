///* Write a program to reverse a string using recursive algorithm*/
//
//public class StringReverseRecursion{
//    
//  
//    private static String rev= "";
//    
//    public static void main(String[] args){
//        String sms ="message";
//        System.out.println(recursion(sms));
//       
//    }
//    
//    public static String recursion(String recv){
//        
//        
//        if(recv.length() ==1)
//        return recv;
//        
//        rev = rev + recv.charAt(recv.length()-1)+ recursion(recv.substring(0, (recv.length()-1)));
//        
//        return rev;
//    }
//}


/* Write a program to reverse a string using recursive algorithm*/

public class StringReverseRecursion{
    
  
    private static String rev= "";
    
    public static void main(String[] args){
        String sms ="message";
        System.out.println(recursion(sms));
    }
    
    public static String recursion(String recv){
        
        
        if(recv.length() ==0)
        return recv;
        
        rev = rev + recv.charAt(recv.length()-1);
        recursion(recv.substring(0, (recv.length()-1)));
        
        return rev;
    }
}