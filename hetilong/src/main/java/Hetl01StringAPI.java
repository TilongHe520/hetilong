import java.util.Scanner;

public class Hetl01StringAPI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "sc.next()";
        System.out.println(s.charAt(s.length()-1));
        char[] c = s.toCharArray();
        System.out.println(c[c.length/2]);
        String str = "hetilong hello world";
        String small = "he";
        System.out.println(str.substring(3,8));
        boolean b = str.contains("str");
        int f = str.indexOf(small);
        System.out.println(b);
        System.out.println(f);
        System.out.println(getCount(str,small));

        /*
        **字符串缓冲区 StringBUffer、StringBuilder
        * append delete insert replace reverse toString
         */
        StringBuffer sbf = new StringBuffer();

        sbf.append("hahh");
        sbf.insert(2,"it");
        String s1 = sbf.toString();
        System.out.println(s1);

        int[] a={1,2,3,4,5,6,7,8};
        System.out.println(toString01(a));
    }

    public static int getCount(String big,String small){
        int count = 0;
        int index = -1;
        while((index = big.indexOf(small)) != -1){
            count++;
            big = big.substring(index+1);
        }
        return count;
    }

    public static String toString01(int[] arr){
        StringBuilder sbd = new StringBuilder();
        sbd.append("[");
        for (int i =0;i<arr.length;i++){
            if(i<arr.length-1){
                sbd.append(arr[i]+",");
            }else {
                sbd.append(arr[i]+"]");
            }
        }
        return sbd.toString();
    }
}
