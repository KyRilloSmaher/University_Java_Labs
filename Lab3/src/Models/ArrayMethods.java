
package Models;

/**
 *
 * @author kyrillos
 */
public class ArrayMethods {
    
    static boolean isPrime (int x){
        Boolean flag = true ;
        for (int i = 2 ; i<x ; i++){
            if(x%i == 0) {
                flag = false ;
                break;
            }
        }
        return flag ;
    }
    static int countFactors(int x){
        int count =0;
         for(int i= 1 ; i<= x ;i++){
             if(x%i ==0) count++;
         }
        
        return count;
        
    }

    public static int []  insertAt(int [] oldarray , int insertedvalue , int pos){
        //if(oldarray.length < pos || pos<0 ) return false ;
        //for(int i = oldarray.length-1 ; i>pos ;i--){
          // oldarray[i+1]=oldarray[i];
           
        //}
       // oldarray[pos]= insertedvalue;
       // return true ;
        
        
        if (pos < 0 || pos > oldarray.length)
            return oldarray;
        int []result = new int [oldarray.length + 1];
        for (int i = 0; i <= oldarray.length; i++)
        {
            if(i< pos)
                result[i] = oldarray[i];
            else if(i == pos)
                result[i] = insertedvalue;
            else
                result[i] = oldarray[i-1];
        }
        return result;
    }
      
    public static int [] getPrimes(int array []){
        int [] primes= new int[0];
        for(int x : array){
            if(isPrime(x)){
                primes = insertAt(primes , x ,primes.length);
            }
        }
        return primes;
    }
    
    public static int [][][] getFactors(int arr[]){
      int [][][]result =new int [arr.length][][];
      
       for (int i = 0 ;i< arr.length ;i++){
           result[i] = new int[countFactors(arr[i])][2];
           int index = 0;
           
           for (int j = 1 ; j<=arr[i] ;j++){
               if(arr[i]%j ==0){
                   result[i][index][0] = j;
                   if(j%2== 0) result[i][index][1] = 1;
                   else result[i][index][1] = 0;
                  index++;
               }
           }
       }
      
      return result ;
    
    }
}
