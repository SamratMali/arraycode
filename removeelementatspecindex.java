//Removing Element From A Specific Index
import java.util.Arrays;
import java.util.Scanner;
public class removeelementatspecindex {
    public static void main(String[] args)
    {   
        Scanner Sc =new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] temp = new int[arr1.length-1];

        System.out.println("Enter The Index");
        int index = Sc.nextInt();

        if(index>=0 && index<arr1.length)
        {  
            for(int i=0,j=0;i<arr1.length;i++)
            {
                if(i!=index )
                {
                    temp[j++]=arr1[i];
                }
              
              
            }

            System.out.println(Arrays.toString(temp));

        }
      
    }
    
}
