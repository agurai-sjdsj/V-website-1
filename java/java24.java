import java.util.*;
public class java24 {
    public static void main(String[] args){
        System.out.print("Enter the n value:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                 System.out.print(" *  ");
            }
            System.out.println();
        }

    }
}