package cn.com.hetl.hetlfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("f:\\file.txt");
        //FileOutputStream fileOutputStream = new FileOutputStream(file);
        //byte[] data = "abcd".getBytes();
        //fileOutputStream.write(data);

        //追写
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        String str = "\r\n"+"hetilong";
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();
    }
}
