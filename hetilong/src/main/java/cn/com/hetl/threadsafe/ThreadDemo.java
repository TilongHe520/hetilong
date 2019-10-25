package cn.com.hetl.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(3);

        Tickets t = new Tickets();
        /*
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.start();t2.start();t3.start();

         */
        service.submit(t);
        service.submit(t);
        service.submit(t);
        service.shutdown();
    }
}
