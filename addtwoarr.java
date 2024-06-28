import java.util.Arrays;

public class addtwoarr {

    public static void main(String[] args)
    {
        int[] arr1 ={2,3,4,5,6,7};
        int[] arr2 ={9,8,6,7,5,4};
        int[] temp = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length;i++)
        {
            temp[i]=arr1[i];
        }
        for(int i=arr1.length,j=0;i<temp.length;i++,j++)
        {
            temp[i] = arr2[j];
        }
        System.out.println(Arrays.toString(temp));


    }
    
}
