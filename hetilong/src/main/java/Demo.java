import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入取出金额：");
        while (true){
            int n = sc.nextInt();
            int flag = 0;
            if(n%100!=0 && n<10000) {
                System.out.println("请输入100的整数倍,且金额不能超过10000");
                flag=1;
            }
            if(flag==0){
                double sxf = n*0.0002;
                if(sxf<2){
                    System.out.println("手续费为："+2);
                }else if(sxf>10){
                    System.out.println("手续费为："+10);
                }else{
                    System.out.println("手续费为："+sxf);
                }
                break;
            }
        }


    }
}
