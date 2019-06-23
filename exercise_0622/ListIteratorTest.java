package exercise.exercise_0622;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        /*Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            list.set(3,"5");
        }*/
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("----");
        while(listIterator.hasPrevious()){
            list.set(3,"5");
            System.out.println(listIterator.previous());
        }
    }
}
