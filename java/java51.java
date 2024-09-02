import java.util.Scanner;

public class java51 {
    public static void main(String[] args) {
        System.out.print("Enter the n value:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the left shift value:");
        int p=sc.nextInt();
        int bitmask=1<<p;
        int num=bitmask | n;
        sc.close();
        System.out.print("The answer is:"+num+"\n");
    }
}

