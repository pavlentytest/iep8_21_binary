package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,34,5,3,4,5,345,4555,3333,-5,3452,889);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList,5));

        // Arrays.sort(int); // quick sort
        //Arrays.sort(); // merge Sort - Tim sort

        ArrayList<String> names  = new ArrayList<>();
        names.add("Ivan");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Oleg");
        names.add("Olga");
        names.add("Max");
        names.add("Max");


        TreeSet<String> treeSet = new TreeSet<>(names);
        for(String s: treeSet) {
            System.out.println(s);
        }
        class Person implements Comparable<Person> {
            private String name;
            private int mark;

            public Person(String name, int mark) {
                this.name = name;
                this.mark = mark;
            }

            @Override
            public int compareTo(Person o) {
                return this.mark-o.mark;
            }
        }

        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Max",20));
        personTreeSet.add(new Person("Alex",20));
        personTreeSet.add(new Person("Maria",18));
        personTreeSet.add(new Person("Maria",14));
        personTreeSet.add(new Person("Olga",17));
        System.out.println("----------------------------");
        for(Person p: personTreeSet ) {
            System.out.println("Age: "+p.mark+"; name: "+p.name);
        }
        System.out.println("----------------------------");
        SortedSet<Person> result = personTreeSet.tailSet(new Person("",18));
        for(Person p: result ) {
           System.out.println("Age: "+p.mark+"; name: "+p.name);
        }

    }
}
