import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();

        int[] arr = new int[10];

        for(int i = 0; i < N.length(); i++) {
            int num = Integer.parseInt(String.valueOf(N.charAt(i)));
            arr[num]++;
        }

        int k = arr[6] + arr[9];

        if(k % 2 == 0) {
            arr[6] = k / 2;
        } else {
            arr[6] = (k / 2) + 1;
        }

        arr[9] = 0;

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);

    }
}
