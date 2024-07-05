import java.util.Arrays;

public class leftshifting {
    
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
    
             int temp = arr1[arr1.length - 1];
                for (int i = arr1.length - 1; i > 0; i--)
                {
                    arr1[i] = arr1[i - 1];
                }
                arr1[0] = temp;

                System.out.println(Arrays.toString(arr1));
                }
            }
            
