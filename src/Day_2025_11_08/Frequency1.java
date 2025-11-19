package Day_2025_11_08;

import java.util.HashMap;
import java.util.Map;

public class Frequency1 {
    public static void main(String[] args) {
        System.out.println("Frequency");
        String str="aabbbccdddeffff";
        char[] strArr = str.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<>();

        //collecting to hashmap
        for (char x : strArr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }


        //printing
        hm.forEach((k,v)->{
            System.out.print(k);
            System.out.print(v);
        });

        //otherway
        System.out.println("\nAnother way");
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }

    }
}
