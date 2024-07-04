import java.util.Arrays;

public class swapingarray {
    public static void main(String[] args)
    {
        int[] arr1 ={1,3,4,5,67,8,9};

        for(int i=0,j=arr1.length-1;i<j;i++,j--)
        {
            int temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;

            
        }

        System.out.println(Arrays.toString(arr1));
    }
}
