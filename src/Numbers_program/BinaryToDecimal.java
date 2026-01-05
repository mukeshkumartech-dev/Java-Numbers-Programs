package Numbers_program;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        int decimal = 0, base = 1;

        while (binary != 0) {
            decimal += (binary % 10) * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal = " + decimal);
        sc.close();
    }
}
