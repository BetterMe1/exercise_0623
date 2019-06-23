package exercise.exercise_0622;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aaa");
        map.put(5,"bbb");
        map.put(3,"aaa");
        map.put(null,null);
        System.out.println(map);
        Set<Integer> keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Integer i = (Integer) iterator.next();
            System.out.println(i+" "+map.get(i));
        }
    }
}
