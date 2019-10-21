import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            hetl(a[j][0],a[j][1]);
        }

    }
    public static void hetl(int a,int b){
        int c=a*a-b*b;
        int flag=0;
        for (int j=2;j<=c/j;j++){
            if(c%j==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
