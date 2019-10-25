package cn.com.hetl.xiancheng;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(3);

        MyRunable1 m = new MyRunable1();

        service.submit(m);
        service.submit(m);
        service.submit(m);
        service.submit(m);
        service.submit(m);
        service.shutdown();
    }
}
