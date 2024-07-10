//Code to Insert a element  at Specific Index

import java.util.Arrays;
import java.util.Scanner;

public class insertarrayatspecindex {
   public static void main(String[] args) {
    
    int[] arr1 ={1,2,3,4,5,6,7,8};
    int[] temp= new int[arr1.length+1];

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Index at Which You Want To Insert An Element:");
    int index = sc.nextInt();

    System.out.println("Enter The Element");
    int ele =sc.nextInt();

    if(index>0 && index<temp.length)
    {
        for(int i=0;i<arr1.length+1;i++)
        {
            if(i<index)
            {
            temp[i]=arr1[i];
            }
            else if (i==index) 
            {
                temp[i]=ele;
            } 
            else {

                   temp[i]=arr1[i-1]; 
            }
        }
      
    }

    System.out.println(Arrays.toString(temp));
   }
}
