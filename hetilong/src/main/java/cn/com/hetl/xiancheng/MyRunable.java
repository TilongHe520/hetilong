package cn.com.hetl.xiancheng;

public class MyRunable implements Runnable{
    @Override
    public void run(){
        for(int i = 0;i<10;i++) {
            System.out.println("实现Runable接口"+i);
        }
    }
}
