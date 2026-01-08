package Numbers_program;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Not Happy");
            sc.close();
            return;
        }

        while (num != 1 && num != 4) {
            int sum = 0;
            while (num != 0) {
                int d = num % 10;
                sum += d * d;
                num /= 10;
            }
            num = sum;
        }

        System.out.println(num == 1 ? "Happy Number" : "Not Happy");
        sc.close();
    }
}
