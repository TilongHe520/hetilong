package cn.com.hetl.myjdbc;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.util.ArrayList;
import java.util.List;

public class QueryRunnerDemo {
    public static void main(String[] args){
        insert();
        select();
    }

    private static QueryRunner qr = new QueryRunner(JDBCPoolUtils.getDataSource());

    public static void select(){
        String sql = "select * from sort";
        try{
            List<Object[]> list = qr.query(sql,new ArrayListHandler());
            for(Object[] ob :list){
                for(Object o : ob){
                    System.out.print(o+"\t");
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //数据表添加数据
    public static void insert(){
        String sql = "INSERT INTO sort (sname,sprice,sdesc)VALUES(?,?,?)";
        Object[] params = {"水果",100.12,"刚刚上市的核桃"};
        try{
            int row = qr.update(sql, params);
            System.out.println(row);
        }catch(Exception ex){
            throw new RuntimeException("数据添加失败");
        }
    }
}
