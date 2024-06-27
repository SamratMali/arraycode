public class sumofoddandeven {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,};
        int sumodd=0;
        int sumeven=0;

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sumeven+=arr[i];
            }
            else{
            sumodd+=arr[i];
            }
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
    }
}
