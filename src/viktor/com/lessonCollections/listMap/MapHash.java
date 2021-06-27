package viktor.com.lessonCollections.listMap;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
    public static void mapHashMap() {

        String str = "Расскажи про покупки! Про какие про покупки?";
        str = str.replaceAll("\\p{Punct}", " ");
        String [] arrayStr = str.split("\\s+");
        Integer count = 0;

        Map<String, Integer> mapHash = new HashMap<String,Integer>();


        System.out.println(str);
        System.out.println(mapHash);
    }
}
