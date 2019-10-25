package cn.com.hetl.xiancheng;

public class ThreadDemo {
    public static void main(String[] args){
        MyThread myThread = new MyThread("新的线程！");
        MyThread myThread1= new MyThread("新的线程2");
        MyRunable myRunable = new MyRunable();
        Thread t1 = new Thread(myRunable);
        Thread t2 = new Thread(myRunable);
        t1.start();
        t2.start();
        myThread.start();
        myThread1.start();
        for(int i=0;i<100;i++){
            System.out.println("main线程"+i);
        }
    }
}
