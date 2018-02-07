package IsoscelesTriangle;

import java.util.Scanner;

public class Isosceles {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write a number:");
        int number = reader.nextInt();
        int iterator = 1;

        for(int line=1;line<=number;line++) {
            for (int column = 1; column <= iterator; column++) {
                System.out.print("*");
            }
            iterator=iterator+2;
            System.out.println("");
        }
    }
}
