import java.util.Scanner;

public class MaximumElementDivisibleByFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int maximumNumber = 0;
        int nextNumber;
        for (int i = 0; i < number; i++) {
            nextNumber = scanner.nextInt();
            if (nextNumber % 4 == 0 && maximumNumber < nextNumber) {
                maximumNumber = nextNumber;
            }
        }
        System.out.print(maximumNumber);
    }
}