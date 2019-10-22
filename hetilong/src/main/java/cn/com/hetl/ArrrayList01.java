package cn.com.hetl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrrayList01 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        ArrayList<Person> list1 = new ArrayList<Person>();
        list1.add(new Person("小强",20));
        list1.add(new Person("小网",23));
        list1.add(new Person("小和",25));
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        Collection<Person> coll = new ArrayList<Person>();
        coll.add(new Person("小强",20));
        coll.add(new Person("小he",21));
        coll.add(new Person("小强",25));

        Iterator<Person> it = coll.iterator();
        while(it.hasNext()){
            Person s = it.next();
            System.out.println(s);
        }

        for (Person p:coll) {
            System.out.println(p);
        }
    }
}
