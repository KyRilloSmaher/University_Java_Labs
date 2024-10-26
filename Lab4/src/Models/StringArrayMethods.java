package Models;

import java.util.HashMap;

public class StringArrayMethods {
               //Find the string with the longest length.
     
         public static String longestStringInArray(String [] arr){
          String target=null;
          int maxlen =0;
          
          for(int i = 0 ; i<arr.length ;i++){
              if(arr[i].length()>maxlen){
                  maxlen = arr[i].length();
                  target = arr[i];
              }
          }
          return target;
      }
    
    // Find the most frequent string.
          public static String findMostFrequentString(String[] strings) {
                HashMap<String, Integer> freqMap = new HashMap<>();

        
        for (String str : strings) {
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        String mostFrequent = null;
        int maxCount = 0;

        
        for (HashMap.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    //Reverse the strings that have even lengths. 
          public static String[] reverseEvenStrings(String []arr){
              for(int i = 0 ; i<arr.length; i++)
               {
                  if(arr[i].length()%2 ==0){
                       StringBuffer help = new StringBuffer();
                             for(int k = (arr[i].length()-1) ; k>=0; k--)
                                {
                                   help.append(arr[i].charAt(k));
                                }
                          arr[i]=help.toString();
                  }
              }
             return arr;
          }
    


// Find the string with the maximum occurrence of a character.
          
          private static int countCharacterOccurrences(String str, char target) {
                    int count = 0;
                    for (char c : str.toCharArray()) {
                        if (c == target) {
                            count++;
                        }
                    }
        return count;
    }
          public static String findStringWithMaxCharOccurrence(String[] strings, char target) {
        String maxString = null;
        int maxCount = 0;

        for (String str : strings) {
            int count = countCharacterOccurrences(str, target);
            if (count > maxCount) {
                maxCount = count;
                maxString = str;
            }
        }

        return maxString != null ? maxString : "No strings found.";
    }


    
   /*
    Count the strings that contain a specified file extension, 
     assuming that the data stored in the array represents file names 
     with extensions like “A.java”.
    */
    public static int countFilesWithExtension(String[] fileNames, String extension) {
        int count = 0;

        for (String fileName : fileNames) {
            if (fileName.endsWith(extension)) {
                count++;
            }
        }

        return count;
    }
}
