package Numbers_program;

import java.util.Scanner;

public class AdamNumber {

    static int reverse(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Not Adam");
            sc.close();
            return;
        }

        int sq = num * num;
        int rev = reverse(num);
        int revSq = reverse(rev * rev);

        System.out.println(sq == revSq ? "Adam Number" : "Not Adam");
        sc.close();
    }
}
