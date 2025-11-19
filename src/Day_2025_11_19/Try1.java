package Day_2025_11_19;

import java.util.HashMap;
import java.util.Map;

public class Try1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.forEach((k,v)->System.out.println(k+" "+v));
        map.entrySet().forEach(System.out::println);
    }
}
