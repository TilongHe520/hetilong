package cn.com.hetl.xiancheng;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    /*
    **重写run方法
     */
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"正在执行"+i);
        }
    }
}
