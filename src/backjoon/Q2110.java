package backjoon;
import java.util.Arrays;
import java.util.Scanner;
public class Q2110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), c = scan.nextInt();

        int[] houses = new int[n];
        for(int i = 0; i < n; i++) houses[i] = scan.nextInt();
        Arrays.sort(houses);

        int left = 1, right = houses[n-1] - houses[0], mid = 0;
        while(left <= right) {
            int cnt = 1, prev = houses[0];
            mid = (left + right) / 2;

            for(int house : houses) {
                if(house - prev >= mid) {
                    cnt++; prev = house;
                }
            }

            if(cnt >= c) left = mid + 1;
            else right = mid - 1;
        }
        System.out.print(right);
    }
}