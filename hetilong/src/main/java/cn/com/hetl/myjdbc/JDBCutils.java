package cn.com.hetl.myjdbc;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCutils {
    private static String driver;
    private static String url;
    private static String user;
    private static String passward;

    static {
        try {
            Properties prop = new Properties();
            Reader r = new FileReader("db.properties");
            prop.load(r);
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            passward = prop.getProperty("password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //获得链接：
    public static Connection getConnection(){
        try{
            //注册驱动
            Class.forName(driver);
            //获得链接
            Connection conn = DriverManager.getConnection(url,user,passward);
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
