import java.util.Scanner;

public class java9 {
        public static void main(String[] args) {
        System.out.print("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i=0;
        do
        {
            System.out.println(i);
            i=i+1;
        }while(i<n); 
    }
}
