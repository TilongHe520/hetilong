package cn.com.hetl;

import java.util.*;

public class Demo {
    public static void main(String[] args){
        function6();
    }
    //list
    public static void function1(){
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("bcd");
        list.add("cde");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            /*
            **修改长度后  会抛出异常
             */
            if(s.equals("cde")){
                list.add("edf");
            }
            System.out.println(s);
        }
    }
    //linkedlist
    public static void function2(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("qac");
        linkedList.add("afdaf");
        linkedList.addFirst("bce");
        linkedList.addLast("afdad");
        System.out.println(linkedList);
    }
    //hashset
    public static void function3(){
        HashSet<Person> hashSet = new HashSet<Person>();
        hashSet.add(new Person("a",11));
        hashSet.add(new Person("b",10));
        hashSet.add(new Person("b",10));
        hashSet.add(new Person("c",25));
        hashSet.add(new Person("d",19));
        hashSet.add(new Person("e",17));
        System.out.println(hashSet);
        Iterator<Person> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    //linkedhashset
    public static void function4(){
        LinkedHashSet<Person> hashSet = new LinkedHashSet<Person>();
        hashSet.add(new Person("a",11));
        hashSet.add(new Person("b",10));
        hashSet.add(new Person("b",10));
        hashSet.add(new Person("c",25));
        hashSet.add(new Person("d",19));
        hashSet.add(new Person("e",17));
        System.out.println(hashSet);
    }
    //map
    public static void function5(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("c",3);
        map.put("b",2);
        map.put("e", 11);
        map.put("f", 12);
        map.put("g", 13);
        map.put("d", 14);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            int value = map.get(key);
            System.out.println(key+" "+value);
        }
        //Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        //Iterator<Map.Entry<String,Integer>> it1 = entrySet.iterator();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
          System.out.println(entry.getKey()+"..."+entry.getValue());
        }
    }
    //hashmap  hashtable linkedhashmap
    /*
     *  Map接口实现类 Hashtable
     *  底层数据结果哈希表,特点和HashMap是一样的
     *  Hashtable 线程安全集合,运行速度慢
     *  HashMap 线程不安全的集合,运行速度快
     *
     *  Hashtable命运和Vector是一样的,从JDK1.2开始,被更先进的HashMap取代
     *
     *  HashMap 允许存储null值,null键
     *  Hashtable 不允许存储null值,null键
     *
     *  Hashtable他的孩子,子类 Properties 依然活跃在开发舞台
     */
    public static void function6(){
        HashMap<Person,String> map = new HashMap<Person,String>();
        map.put(new Person("a",20), "里约热内卢");
        map.put(new Person("b",18), "索马里");
        map.put(new Person("b",18), "索马里");
        map.put(new Person("c",19), "百慕大");
        for(Person key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+"..."+value);
        }
        System.out.println("===================");
        for(Map.Entry<Person, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"..."+entry.getValue());
        }
        LinkedHashMap<Person,String> map1 = new LinkedHashMap<Person,String>();
        map1.put(new Person("a",20), "里约热内卢");
        map1.put(new Person("b",18), "索马里");
        map1.put(new Person("b",18), "索马里");
        map1.put(new Person("c",19), "百慕大");

        System.out.println(map1);
    }

}
