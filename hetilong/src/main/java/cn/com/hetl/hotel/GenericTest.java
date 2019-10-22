package cn.com.hetl.hotel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericTest {
    public static void main(String[] args){
        ArrayList<FuWuYuan> fwy = new ArrayList<FuWuYuan>();
        ArrayList<JingLi> jl = new ArrayList<JingLi>();

        fwy.add(new FuWuYuan("张三","fwy001"));
        fwy.add(new FuWuYuan("离散","fwy003"));

        jl.add(new JingLi("wanger","jl005",2156.21));
        jl.add(new JingLi("mazi","jl002",1534.235));

        iterator(jl);
        iterator(fwy);
    }
    public static void iterator(Collection<? extends Employee> array){
        Iterator<? extends Employee> it = array.iterator();
        while (it.hasNext()){
            Employee e = it.next();
            e.work(e.getName());
        }
    }
}
