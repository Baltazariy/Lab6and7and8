package Laba7;


import Laba6_2.Poezd;
import Laba6_2.Vagon;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(new Vagon(12,12,"1"));
        myList.add(new Vagon(1,1,"2"));
        myList.add(new Vagon(11,12,"3"));
        Iterator<Vagon> iterator = myList.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        try {
            System.out.println(iterator.next());
        } catch (NoSuchElementException e) {
            System.out.println("Ты не прав:)");
        }
    }
}