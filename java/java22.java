import java.util.Scanner;

public class java22 {
        public static void main(String[] args) {
        System.out.print("Enter the value of n:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(((i+j)%2) == 0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}
