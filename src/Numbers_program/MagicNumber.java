package Numbers_program;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Not Magic");
            sc.close();
            return;
        }

        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        System.out.println(num == 1 ? "Magic Number" : "Not Magic");
        sc.close();
    }
}
