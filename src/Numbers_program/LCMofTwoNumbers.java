package Numbers_program;

import java.util.Scanner;

public class LCMofTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd numbers: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        int lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
