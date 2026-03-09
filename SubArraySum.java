package Module6;

public class SubArraySum {
        public static void main(String[] args) {
            int[] arr = {3,6,-1,8,4,2};
            int max = arr[0];
            int current = arr[0];

            for(int i=1;i<arr.length;i++){
                current = Math.max(arr[i], current + arr[i]);
                max = Math.max(max, current);
            }

            System.out.println(max);
        }
    }

