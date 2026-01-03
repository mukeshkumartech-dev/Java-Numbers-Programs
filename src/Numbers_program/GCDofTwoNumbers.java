package Numbers_program;

import java.util.Scanner;

public class GCDofTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd numbers: ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
        sc.close();
    }
}
