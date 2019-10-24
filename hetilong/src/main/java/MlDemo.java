import java.util.LinkedList;
import java.util.Scanner;

public class MlDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        LinkedList<String> linkedList = new LinkedList<String>();
        for(int l = c.length-1;l>=0;l--){
            String strm = String.valueOf(c[l]);
            if(!linkedList.contains(strm)){
                linkedList.add(strm);
            }
        }
        String a="";
        for (String i:linkedList) {
            a =a+i;
        }
        System.out.println(a);
    }
}
