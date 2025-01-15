import java.util.Scanner;

public class ArmstrongAndMultiplicationTable {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

    
        while (number != 0) {
            number /= 10;
            digits++;
        }

        number = originalNumber;

        
        while (number != 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, digits);
            number /= 10;
        }

        
        return sum == originalNumber;
    }

    
    public static void printMultiplicationTable(int number) {
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        
        printMultiplicationTable(number);

        scanner.close();
    }
}
