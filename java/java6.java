import java.util.*;
public class java6 {
    public static void main(String[] args) {
        System.out.print("Enter the first number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.print("Enter the operation:");
        Scanner sc1 = new Scanner(System.in);
        char ch = sc1.next().charAt(0);
        sc.close();
        sc1.close();
        switch(ch)
        {
            case '+':
            {
                float result = a+b;
                System.out.print("The result is:");
                System.out.print(result);
                break;
            }
            case '-':
            {
                float result = a-b;
                System.out.print("The result is:"+result+"\n");
                break;
            }
            case '/':
            {
                float result = a/b;
                System.out.print("The result is:"+result+"\n");
                break;
            }
            case '*':
            {
                float result = a*b;
                System.out.print("The result is:"+result+"\n");
                break;
            }
            default:
            {
                System.out.println("Invalid operation or numbers.");
            } 
        }
    }
    
}