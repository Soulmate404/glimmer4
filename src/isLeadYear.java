
//emmm我想进步！努努力直接写了一个输入年份判断闰年的小流程，其实可以更细致一点，加点引导什么请输入年份啊之类的，但感觉没意义，就没搞，形式主义要不到
import java.util.Scanner;

public class isLeadYear {
    public static boolean IsLeadYear(int year) {
        boolean isLeadYear;
        if((year%4==0&&year%100!=0)||(year%400==0)){//能被四整除但不能被100整除的以及能被400整除的是闰年
            isLeadYear=true;
        }
        else{isLeadYear=false;}
        return isLeadYear;
    }
    public static void main(String[] args) {
        int year;
        Scanner in=new Scanner(System.in);
        year=in.nextInt();
        if(IsLeadYear(year)){
            System.out.println(1);//1代表是闰年
        }
        else{
            System.out.println(2);//2代表不是闰年
        }
    }
}

