import java.util.Arrays;

public class zigzagcopy{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};
        int[] temp = new int[arr1.length+arr2.length];

        for(int i=0,j=0;i<temp.length;i+=2,j++)
        {

            temp[i]=arr1[j];
            temp[i+1]=arr2[j];
        }
        System.out.println(Arrays.toString(temp));

    }
}