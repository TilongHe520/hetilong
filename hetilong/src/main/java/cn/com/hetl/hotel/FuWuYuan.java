package cn.com.hetl.hotel;

public class FuWuYuan extends Employee implements VIP{
    public FuWuYuan(){
        super();
    }
    public FuWuYuan(String name,String id){
        super(name, id);
    }
    public void work(String name){
        System.out.println(name+"服务员上菜");
    }
    public void services(){
        System.out.println("倒酒");
    }
}
