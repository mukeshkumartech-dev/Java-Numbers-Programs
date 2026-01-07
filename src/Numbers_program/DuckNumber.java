package Numbers_program;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // 0 is NOT a Duck Number
        if (num == 0) {
            System.out.println("Not Duck");
            sc.close();
            return;
        }

        boolean isDuck = false;
        int temp = num;

        while (temp > 0) {
            if (temp % 10 == 0) {
                isDuck = true;
                break;
            }
            temp /= 10;
        }

        System.out.println(isDuck ? "Duck Number" : "Not Duck");
        sc.close();
    }
}
