package cn.com.hetl.hetlfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        /*写
        prop.setProperty("a","A");
        prop.setProperty("b","B");
        prop.setProperty("c","C");
        FileWriter fileWriter = new FileWriter("prop.properties");
        prop.store(fileWriter,"save data");
        fileWriter.close();
         */
        //读
        FileInputStream in = new FileInputStream("prop.properties");
        prop.load(in);
        in.close();
        System.out.println(prop);
    }
}
