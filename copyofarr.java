import java.util.Arrays;

public class copyofarr {
    public static void main(String[] args)
    {
        int[] arr={2,3,4,5,6,6};
        int[] temp= new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
                temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));

    }
    
}
