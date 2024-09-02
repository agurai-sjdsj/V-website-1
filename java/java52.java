import java.util.Scanner;

public class java52 {
        public static void main(String[] args) {
        System.out.print("Enter the n value:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the left shift value:");
        int p=sc.nextInt();
        int bitmask = 1<<p;
        int num = ~bitmask;
        int ans = n&num;
        sc.close();
        System.out.print("The cleared answer is:"+ans+"\n");
}
}
