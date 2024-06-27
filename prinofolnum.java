public class prinofolnum {
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,6,7,6,7};
        for(int start=0,end=arr.length-1;start<=end;start++,end--)
        {
                if(start!=end)
                {
                    System.out.println(arr[start]+" "+arr[end]);
                }
                else{
                    System.out.println(arr[start]);
                }
        }
    }
}
