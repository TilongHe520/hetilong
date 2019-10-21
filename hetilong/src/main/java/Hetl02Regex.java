import java.util.Scanner;

public class Hetl02Regex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String qqmail = sc.next();
        //邮箱正则
        String regex ="[a-zA-Z_0-9]+@[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)+";
        String regex1 = "[1-9][0-9]{2}+(\\.[1-9][0-9]{2}){3}";
        boolean flag= ifLegal(qqmail,regex1);
        System.out.println(flag);
    }
    public static boolean ifLegal(String ip,String regex){
        boolean flag = ip.matches(regex);
        return flag;
    }
}
