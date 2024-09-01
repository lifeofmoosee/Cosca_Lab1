import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int numRows = input.nextInt();

        // Upper half of the pattern
            System.out.println("*");
        
        for (int i = 1; i <= numRows; i++) {
            // Print stars
            System.out.print("*");

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Print ending star and newline
            System.out.println("*");
        }

        // Lower half of the pattern (excluding the middle row)
        for (int i = numRows - 1; i >= 1; i--) {
            // Print stars
            System.out.print("*");

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Print ending star and newline
            System.out.println("*");
        }
            System.out.println("*");
    }
}
