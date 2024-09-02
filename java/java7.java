import java.util.*;
/**
 * Innerjava7
 */ 
public class java7 {
    public static void main(String[] args) {
        System.out.print("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
          System.out.println(i);
        }
    }
}
