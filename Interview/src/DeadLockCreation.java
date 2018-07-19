/*  Write a program to create deadlock between two threads.
*/

public class DeadLockCreation{
    private String str1 = "Hello";
    private String str2 = "World";
    
    Thread t1 = new Thread("Thread 1"){
     public void run(){
         while(true){
             synchronized(str1){
                 synchronized(str2){
                     System.out.println(str1+" "+str2);
                 }
             }
         }
     }   
    };
    
    Thread t2 = new Thread("Thread 2"){
      public void run(){
         while(true){
             synchronized(str2){
                 synchronized(str1){
                     System.out.println(str1+" "+str2);
                 }
             }
         }
     }   
    };
    
    public static void main(String[] args){
        DeadLockCreation d = new DeadLockCreation();
        d.t1.start();
        d.t2.start();
    }
    
}