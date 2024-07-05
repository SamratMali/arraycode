import java.util.Arrays;

public class ZIgZagcopyuneven {
  

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5, 6};
            int[] arr2 = {7, 8, 9, 0, 4};
            int[] temp = new int[arr1.length + arr2.length];
    
            int i = 0, j = 0, k = 0;
    
           
            while (i < arr1.length && i < arr2.length) {
                temp[k++] = arr1[i];
                temp[k++] = arr2[i];
                i++;
            }
    
          
            while (i < arr1.length) {
                temp[k++] = arr1[i++];
            }
    
            while (i < arr2.length) {
                temp[k++] = arr2[i++];
            }
    
            System.out.println(Arrays.toString(temp));
        }
    }
    