import java.util.Arrays;
import java.util.Scanner;

public class insertarraytoother {

    public static void main(String[] args)
    {
        int[] arr1={2,3,4,5,6,7,8,9};
        int[] arr2={3,4,5,6};
        int[] temp= new int[arr1.length+arr2.length];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Index at You Want to Indsert these array:");
        int index=sc.nextInt();

        if(index>0 && index<temp.length)
        {
            for( int i=0;i<temp.length;i++)
            {
                if (i<index) {
                    temp[i]=arr1[i];
                    
                }
                else if (i < index + arr2.length) {
                    temp[i] = arr2[i - index];
                }
                else {
                    temp[i] = arr1[i - arr2.length];
                }
            }
            System.out.println(Arrays.toString(temp));

        }
    }
    
}
