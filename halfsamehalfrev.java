import java.util.Arrays;

public class halfsamehalfrev {

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] temp = new int[arr1.length];
        int i=0;
        int j=0;
        int k=arr1.length-1;
        while(i<arr1.length/2 )
        {
            temp[j++]=arr1[i++];
        }
        while (j<arr1.length) {
     
            temp[j++]=arr1[k--];
        }
        System.out.println(Arrays.toString(temp));

        
    }
    
}
