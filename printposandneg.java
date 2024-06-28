public class printposandneg {

        public static void main(String[] args) {
            int[] arr = {2, 4, -3, 5, -9, 4, -7};
            
            System.out.println("Positive and Negative numbers:");
    
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    System.out.println("Positive: " + arr[i]);
                } else if (arr[i] < 0) {
                    System.out.println("Negative: " + arr[i]);
                }
            }
        }
    }
    

