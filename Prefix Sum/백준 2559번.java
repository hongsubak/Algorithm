import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] prefix_sum = new int[N+1];
        for(int i = 0; i < arr.length; i++) {
            prefix_sum[i+1] = prefix_sum[i] + arr[i];
        }

        int[] part_sum = new int[N-K+1];

        for(int i = 0; i< part_sum.length; i++) {
            part_sum[i] = prefix_sum[K+i] - prefix_sum[i];
        }

        // part_sum[0] = prefix_sum[K+0] - prefix_sum[0];
        // part_sum[1] = prefix_sum[K+1] - prefix_sum[1];
        // part_sum[2] = prefix_sum[K+2] - prefix_sum[2];

        // 0 3 1 -3 -12 -12 -9 -2 11 19 16  -> prefix_sum
        // 1 -3-3 -12-1 -12--3 ... -> 9개 (10 - 2 + 1)
        // -12 -9-3 -2-1 ....      -> 6개 (10 - 5 + 1)

        int max = Integer.MIN_VALUE;

        for (int j : part_sum) {
            max = Math.max(max, j);
        }

        System.out.println(max);

    }
}