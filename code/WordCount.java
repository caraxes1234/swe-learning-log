import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        HashMap<String, Integer> count = new HashMap<>();
       
        // your code here:
        // for each word in words:
        //   if it's already a key in count, increment its value by 1
        //   if it's not a key yet, add it with value 1

        // then print each word and its count
        for(int i=0;i<words.length;i++){
           
                 count.put(words[i],count.getOrDefault(words[i],0)+1);
       
            
        }   
          for(Map.Entry<String, Integer>mp:count.entrySet()){ 
            System.out.print(mp.getKey()+"->");
            System.out.println(mp.getValue());
          }
    }
}