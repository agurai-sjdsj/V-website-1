import java.util.*;
public class java54 {
    public static void main(String[] args) {
        System.out.print("Enter the array size:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the array elements:");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
              arr[i]=sc.nextInt();
        }
        System.out.print("The array elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        //bubble short
        System.out.print("The shorted array is:");
        for(int i=0; i<n; i++)
        {
            int small=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;
                }
                int temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
            }
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        sc.close();
    }
}
