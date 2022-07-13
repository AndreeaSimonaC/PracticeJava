import java.util.Scanner;
public class NumbersDivisibleBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int nextNumber;
        int sum = 0;
        for (int i = 1; i <= numberOfElements; i++) {
            nextNumber = scanner.nextInt();
            if (nextNumber % 6 == 0) {
                sum += nextNumber;
            }
        } System.out.println(sum);
    }
}
