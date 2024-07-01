import java.util.Arrays;
import java.util.Scanner;

public class removeoccurance {

    public static void main(String[] args)
    {
        int[] arr1={2,3,4,4,5,6,6,77,8,2,3,4,2};
        int count=0;
        int j=0;
        

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number You Want To Remove");
        int num =sc.nextInt();

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==num)
            {
                count++;
            }
        }
        int[] temp= new int[arr1.length-count];
        for(int i=0;i<arr1.length;i++)
        {
                if(arr1[i]!=num)
                {
                    temp[j++]=arr1[i];
                }
        }

        System.out.println(Arrays.toString(temp));


    }
    
}
