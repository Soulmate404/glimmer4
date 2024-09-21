import java.util.Scanner;
//同样的，直接写成完整的代码

public class diamond {
    public static void print(int n){
        if (n % 2 == 0) {
            System.out.println("输入应当为奇数");//判断是否为奇数
            return;
        }
        int half=n/2;
        //上半部分的打印
        for(int i=0;i<=half;i++){
            for (int j=0;j<=half-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0;j<i*2-1;j++){
                System.out.print(" ");
            }
            if(i!=0){
                System.out.print("*");
            }
            System.out.println();
        }
        //下半部分的打印
        for(int i=1;i<=half;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0;j<n-(i*2)-1;j++){
                System.out.print(" ");
            }
            if(i!=half){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        print(n);
    }
}
//今天脑子有点不对劲，逻辑想不明白，这么点东西我又差不多写了三个小时【想哭ing】
