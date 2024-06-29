package org.epam.collections;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(7);
        arr.add(1);
        arr.add(4);
        arr.add(2);
        // diffrent way to iterate over arrayList
//        Iterator<Integer> iterator= arr.iterator();
//        while (iterator.hasNext()){
//            //System.out.println(iterator.next());
//        }

        ListIterator<Integer> listIterator= arr.listIterator(4);
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        // all method of listIterattor
        // hasNext()
        // next()
        // hasPrevious()
        // previous()
        // nextIndex()
        // previousIndex()


        // Synchronized
        List<Integer> list1= Collections.synchronizedList(new ArrayList<>());
        list1.add(4);
        // method -2
        Collection list2=Collections.synchronizedCollection(Arrays.asList(1,2,3,34,"hello"));
        // this is the way by which we can make list,set,map as synchronized in nature!!!


        // Notes: ListIterator sirf list pe applicable hai
        // ================================================


        Vector<Integer> vector=new Vector<>();
        vector.add(1);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(5);
        vector.add(0);
        Enumeration<Integer> enumeration=vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(1,"raju");
        hashtable.put(2,"ganesh");
        hashtable.put(3,"sonu");
        Set<Integer> set=hashtable.keySet();

    }
}
