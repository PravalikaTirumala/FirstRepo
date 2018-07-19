/*Write a singleton class: Singleton class means you can create only one object for the given class. 
there are 8 ways to create singleton class. 
1) eager initialization(initialization as an instance variable with static keyword) 
2) static block initialization (in a static block) 
3) lazy initialization (creating instance in global access method) 
4) thread safe singleton(synchronied keyword to the global method ) 
5) in inner class 
6) using reflection 
7) enum singleton 
8) serialization and singleton
*/
public class Singleton{
//using sattic block
    private static Singleton obj;
    
    static{
        obj = new Singleton();
    }
    
    private Singleton(){}
    
    public Singleton getInstance(){
        return obj;
    }
    
    public static void test(){
        System.out.println("testing");
    }
    
     public static void main(String []args){
    Singleton obj1 = obj.getInstance();
      obj1.test();	//testing 
     }
     

}