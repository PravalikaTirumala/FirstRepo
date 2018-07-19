/*Find out middle index where sum of both ends are equal ;
*/
public class EqquilibriumIndex{

	 public static void main(String []args){
       
      int arr[] = { 7, 1, 5, 2, 3,7, 1, 5 };
      System.out.println(sumOfBothSidesEqual(arr));
      
     }
     
     public static int sumOfBothSidesEqual(int[] arr1){
       if(arr1==null ||arr1.length<3)
            return -1;
            
        int len= arr1.length;int stind=0;
        int endind=len-1;
        int  lsum=arr1[stind],rsum=arr1[endind];
        
        while(stind<endind){
    	   
        
           if(lsum > rsum)
               rsum = rsum+ arr1[--endind];
            else if(rsum > lsum)
                lsum = lsum+ arr1[++stind];
            else{
                if(++stind == --endind) {
                	
                    return stind;
                }
                else{
                   rsum = rsum+ arr1[endind];  
                   lsum = lsum+ arr1[stind];
                }    
            }
           }
       return -1;
     }
}