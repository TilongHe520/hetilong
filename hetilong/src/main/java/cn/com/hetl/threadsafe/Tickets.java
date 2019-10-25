package cn.com.hetl.threadsafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {
    private int tikect = 1000;
    private Lock lock = new ReentrantLock();
    @Override
    public void run(){
        while (true){
            lock.lock();
            if(tikect>0){
                try{
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+" 出售第 "+tikect--);
                }catch(Exception ex){

                }finally{
                    //释放锁,调用Lock接口方法unlock
                    lock.unlock();
                }
            }
        }
    }
    /*
    public void run(){
        while (true){
            pay();
        }
    }
    public synchronized void pay(){
        if (tikect>0){
            try{
                Thread.sleep(200);
            }catch (Exception ex){

            }
            System.out.println(Thread.currentThread().getName()+" 出售第 "+tikect--);
        }
    }

     */
}
