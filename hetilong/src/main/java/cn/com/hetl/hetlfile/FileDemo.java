package cn.com.hetl.hetlfile;

import java.io.File;
public class FileDemo {
    public static void main(String[] args){
        getAllJava(new File("f:\\tilong_he_test"));
    }
    public static void getAllJava(File dir){
        File[] fileArr = dir.listFiles(new MyJavaFilter());
        for(File f : fileArr){
            //对f路径,判断是不是文件夹
            if(f.isDirectory()){
                //递归进入文件夹遍历
                getAllJava(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
