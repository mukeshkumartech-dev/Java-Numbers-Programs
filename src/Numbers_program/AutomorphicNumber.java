package Numbers_program;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int square = num * num;
        boolean isAutomorphic = true;

        while (temp != 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        System.out.println(isAutomorphic ? "Automorphic Number" : "Not Automorphic");
        sc.close();
    }
}
