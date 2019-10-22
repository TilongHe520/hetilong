package cn.com.hetl.hotel;

public class JingLi extends Employee{
    private double money;
    public JingLi(){}
    public JingLi(String name,String id,double money){
        super(name, id);
        this.money = money;
    }
    public double getMoney(){
        return money;
    }
    public void setMoney(){
        this.money=money;
    }
    public void work(String name){
        System.out.println(name+"官人");
    }
}
