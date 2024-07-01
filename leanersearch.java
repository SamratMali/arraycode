import java.util.Scanner;

public class leanersearch {
    
        public static void main(String args[]) {
            int[] arr = {2, 3, 4, 5, 6, 7, 3, 4, 7, 8, 9, 7, 9, 8, 4, 2};
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number you want to find:");
            int num = sc.nextInt();
            boolean found = false;
    
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    System.out.println(num + " is present in the array.");
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println(num + " is not present in the array.");
            }
        }
    }

