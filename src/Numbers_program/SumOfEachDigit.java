package Numbers_program;

import java.util.Scanner;

public class SumOfEachDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: "); 
        int num = sc.nextInt();                

        int sum = 0;
        int temp = num; 
        while (temp != 0) {
            int last = temp % 10;
            sum += last;
            temp /= 10;
        }

        System.out.println("Sum of each digits = " + sum);

        sc.close();
    }
}
