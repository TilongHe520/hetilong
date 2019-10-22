package cn.com.hetl;

public class Person {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){this.age=age;}
    public String toString(){
        return name+" "+age;
    }
    public Person(){}
    public Person(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    //重写hashcode equals
    public int hashCode(){
        return name.hashCode()+age*55;
    }
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj instanceof Person){
            Person person = (Person)obj;
            return name.equals(person.name) && age==person.age;
        }
        return false;
    }

}
