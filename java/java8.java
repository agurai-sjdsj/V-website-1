import java.util.Scanner;

public class java8 {
        public static void main(String[] args) {
        System.out.print("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i=0;
        while(i<n)
        {
            System.out.println(i);
            i=i+1;
        }
    }
}
