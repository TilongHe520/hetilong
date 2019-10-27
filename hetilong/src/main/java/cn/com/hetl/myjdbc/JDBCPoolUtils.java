package cn.com.hetl.myjdbc;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.io.*;
import java.util.Properties;

public class JDBCPoolUtils {
    private static BasicDataSource dataSource = new BasicDataSource();
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            Properties prop = new Properties();
            Reader r = new FileReader("db.properties");
            prop.load(r);
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            dataSource.setDriverClassName(driver);
            dataSource.setUrl(url);
            dataSource.setUsername(user);
            dataSource.setPassword(password);
            dataSource.setInitialSize(10);
            dataSource.setMaxActive(8);
            dataSource.setMaxIdle(5);
            dataSource.setMinIdle(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource(){
        return dataSource;
    }
}
