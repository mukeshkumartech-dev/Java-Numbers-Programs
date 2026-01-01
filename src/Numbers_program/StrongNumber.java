package Numbers_program;

import java.util.Scanner;

public class StrongNumber {

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;

        while (temp != 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }

        System.out.println(sum == num ? "Strong Number" : "Not Strong");

        sc.close();
    }
}
