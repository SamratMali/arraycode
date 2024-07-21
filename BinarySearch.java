import java.util.*;


public class BinarySearch {

    public static void main(String args[]) {
        int[] arr1 = {1, 2, 6, 9, 4, 7, 5, 8};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search:");
        int num = sc.nextInt();
        
        int start = 0;
        int end = arr1.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num == arr1[mid]) {
                System.out.println(num + " is present at index " + mid);
                found = true;
                break;
            } else if (num > arr1[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println(num + " is not found");
        }

        sc.close();
    }
}