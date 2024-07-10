import java.util.Arrays;

public class halflefthalfright {

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};


        int temp=arr1[arr1.length/2-1];


        for(int i=arr1.length/2-1;i>0;i--)
        {
            arr1[i]=arr1[i-1];
        }
        arr1[0]=temp;
      
     
        int last= arr1[arr1.length / 2];
        for (int i = arr1.length / 2; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        arr1[arr1.length - 1] = last;

        System.out.println(Arrays.toString(arr1));
    }
    
}
