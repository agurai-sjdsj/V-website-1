public class java55 {
        public static void main(String[] args) {
        int arr[]= {2,4,6,5,1};
        System.out.print("The array elements are:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        //bubble short
        System.out.print("The shorted array is:");
        for(int i=0; i<arr.length; i++)
        {
            int cur=arr[i];
            int j=i-1;
            while(j>=0 && cur < arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[i+1] = cur;
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
