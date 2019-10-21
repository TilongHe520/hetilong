package cn.com.hetl;

import java.util.ArrayList;

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
    }
}
