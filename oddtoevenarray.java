import java.util.Arrays;

public class oddtoevenarray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};

        for(int i=0;i<arr1.length;i++)
        {

            if(arr1[i]%2!=0)
            {
                arr1[i]+=1;
            }

        }System.out.println(Arrays.toString(arr1));

    }
    
}
