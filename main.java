package Collecionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {
    public static void main(String[] args ) {
        //list or collection -> interface

        //Arraylist -> concrete class
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
       list.remove(0);
        System.out.println(list);

        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);
        list.addAll(list2);

        list.removeAll(list2);


 //       List<Integer> list = new ArrayList<>();
        //       Collection<Integer> collection = new ArrayList<>();
    }
}
