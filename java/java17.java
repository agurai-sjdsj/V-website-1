import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {
        System.out.print("Enter a number to make its square:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=(n-i);j++)
            {   
                System.out.print(" ");       
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
}
}
