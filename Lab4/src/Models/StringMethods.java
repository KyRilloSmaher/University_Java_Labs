package Models;

import java.util.ArrayList;
import java.util.Collections;

public class StringMethods {
     public StringMethods(){}
    
    
    public static boolean isPalindrome(String tst){
        StringBuffer help = new StringBuffer();
        boolean flag = true ;
                for(int i = (tst.length()-1) ; i>=0; i--){
                    help.append(tst.charAt(i));
                }
                
                for(int i = 0; i< tst.length();i++)
                {
                    if(!(tst.charAt(i)== help.charAt(i))){
                        flag = false ;
                        break;
                    }
                }
        return flag ;
    }
    
    public static String Removeleadingwhitespaces(String tst){
        
        StringBuffer newString = new StringBuffer();
        for(int i = 0; i<tst.length(); i++){
            if(tst.charAt(i) == ' '){
                newString.append("");
            }else{
                newString.append(tst.charAt(i));
            }
        }
        return newString.toString();
    }

    public static int countTheOccurrences (String tst , char x){
        int count = 0;
        
              for(int i = 0; i<tst.length(); i++){
                 if(tst.charAt(i)== x) count++;
              }
        
        return count;
    }

    static boolean isCharExist(StringBuffer tst , char x){
        for(int i =0 ; i<tst.length() ;i++){
            if(tst.charAt(i)== x) return true ;
        }
        return false;
    } 
    
    public static String RemoveDublicated(String tst){
        StringBuffer newtst = new StringBuffer();
          
             for(int i= 0 ;i<tst.length();i++){
                 if(!(isCharExist(newtst , tst.charAt(i))))newtst.append(tst.charAt(i));
             }
        
        return newtst.toString();
    }
    
    public static String[] getDublicatedwords(String tst){
        ArrayList<String> stringarray = new ArrayList<String> ();
        String newtst = tst.trim();
        StringBuffer temp = new StringBuffer();
        
                    for(int i= 0; i<newtst.length(); i++){
                        if(!(newtst.charAt(i)== ' ')){
                            temp.append(newtst.charAt(i));
                        }else{
                            stringarray.add(temp.toString());
                            temp.delete(0, temp.length());
                        }
                    }
                    
                    
                     // Add the last word to the list if it's not empty ( Adding BY Chat GPT )
                            if (temp.length() > 0) {
                                stringarray.add(temp.toString());
                            }
                            
                            
                      
                 Collections.sort(stringarray);
                    
                    ArrayList<String> More_Than_Twice = new ArrayList<String> ();
                    
               for(int i = 0 ; i<stringarray.size();){
                   int c = 1 ;
                   int j= i+1;
                   for( ; j<stringarray.size();j++){
                       if(stringarray.get(i).equals(stringarray.get(j))) c++;
                       else{
                           break;
                       }
                   }
                   if (c>2)More_Than_Twice.add(stringarray.get(i));
                   i=j;
               }
         
               return More_Than_Twice.toArray(new String[0]); //( BY Chat GPT )
    }

    public static int thirdOccurrence(String tst, char x){
        int count = 0;
        for (int i = 0; i < tst.length(); i++)
        {
            if(tst.charAt(i) == x)
                count++;
            if(count == 3)
                return i;
        }
        return -1;
    }
    
    public static void getMinandMaxOcurr(String tst){
        
      /*  
        Map<Character,Integer> map = new HashMap<>();
        
        for (char c : tst.toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
          
        char minChar = ' ';
        char maxChar = ' ';
        int minCount = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;

       
     //Corrected by Chat GPT
     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char currentChar = entry.getKey();
            int count = entry.getValue();

           
            if (count < minCount) {
                minCount = count;
                minChar = currentChar;
            }

            
            if (count > maxCount) {
                maxCount = count;
                maxChar = currentChar;
            }
        }

      */ 
        
        
        //****************** Frequantly Array technique *******************//
        
        
         
        int[] freq = new int[256]; // 256 for extended ASCII

        
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 0;
        }

        
        for (int i = 0; i < tst.length(); i++) {
            char ch = tst.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }

        
        char minChar = ' ';
        char maxChar = ' ';
        int minCount = Integer.MAX_VALUE;
        int maxCount = Integer.MIN_VALUE;

        
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) { 
                if (freq[i] < minCount) {
                    minCount= freq[i];
                    minChar = (char) i; 
                }
                if (freq[i] > maxCount) {
                    maxCount= freq[i];
                    maxChar = (char) i;
                }
            }
        }
        
       
        
        
        System.out.println("Minimum occurring character: '" + minChar + "' occurs " + minCount + " times.");
        System.out.println("Maximum occurring character: '" + maxChar + "' occurs " + maxCount + " times.");
    }
}
