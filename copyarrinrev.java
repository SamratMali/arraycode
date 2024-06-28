import java.util.Arrays;

public class copyarrinrev {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8,9};
        int temp[] = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            temp[arr.length-1-i]=arr[i];
        }
       System.out.println(Arrays.toString(temp));
    }
}
