package cn.com.hetl.hetlfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InPutStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("f:","\\file.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int ch = 0;
        while ((ch=fileInputStream.read())!=-1){
            System.out.println("ch="+(char)ch);
        }
        fileInputStream.close();
    }
}
