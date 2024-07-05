public class palindromarray {
    public static void main(String[] args)
    {
        int[] arr1= {1,2,3,4,3,2,1};
        boolean isPalindrome = true;

        for(int i=0,j=arr1.length-1;i<j;i++,j--)
        {
                if(arr1[i] != arr1[j])
                {
                    isPalindrome = false;
                    break;
                }
               
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }

    }
}
