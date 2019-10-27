package cn.com.hetl.myjdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCDemo {
    @Test
    public void insert(){
        try {
            Connection conn = JDBCutils.getConnection();
            String sql ="insert into sort(sname,sprice,sdesc) values(?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,"包子");
            preparedStatement.setInt(2,2);
            preparedStatement.setString(3,"我喜欢包子");

            int line = preparedStatement.executeUpdate();
            System.out.println("line"+line);
            preparedStatement.close();
            conn.close();
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
}
