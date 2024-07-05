public class printunchangedafrev {
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,8,2,1};

        for(int i=0,j=arr1.length-1;i<j;i++,j--)
        {
            if(arr1[i] == arr1[j])
            {
                System.out.println(arr1[i]);
            }
         
        }

    }
}
