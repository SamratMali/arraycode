import java.util.Arrays;
import java.util.Scanner;

public class insertelementarray {
    public static void main(String[ ] args)
    {   Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of Array:");
        int a=sc.nextInt();
        int[] arr1 = new int[a];

        for(int i=0; i<arr1.length;i++)
        {
            System.out.print("Enter input: ");
           
            arr1[i] = sc.nextInt();
        }


        System.out.println(Arrays.toString(arr1));
    }
}
