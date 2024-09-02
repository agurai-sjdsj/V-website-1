import java.util.Scanner;

public class java53 {
        public static void main(String[] args) {
        System.out.print("Enter the number to shift:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the right shift value:");
        int p=sc.nextInt();
        System.out.print("Update value:");
        int up=sc.nextInt();
        int num;
        if(up == 1)
        {
            int bitmask=1<<p;
            num=bitmask | n;
        }
        else
        {
            int bitmask=1<<p;
            int a=~bitmask;
            num=a & n;
        }
        sc.close();
        System.out.print("The updated value is:"+num+"\n");
}
}