import java.util.*;

public class hash {
    public static void main(String args[]){
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Ram",1);
        myMap.put("Shyam",2);
        myMap.put("Lion",214);
        System.out.println(myMap);
        System.out.println(myMap.containsKey("Ram"));
        for(String mykey : myMap.keySet()){
            System.out.println(mykey);
        }
    }
}