import java.util.Arrays;

public class arraytoprime {

    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = nextPrime(arr1[i]);
        }
        System.out.println(Arrays.toString(arr1));
    }
    
    public static int nextPrime(int num) {
        int j;
        for (j = num + 1; ; j++) {
            int i;
            for (i = 2; i < j; i++) {
                if (j % i == 0) {
                    break;
                }
            }
            if (i == j) {
                break;
            }
        }
        return j;
    }
}
