package Numbers_program;

import java.util.Scanner;

public class SwapTwoNumWithoutTemp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // XOR Swap
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b);

        sc.close();
    }
}
