import java.util.Scanner;

public class SumOfIntegersFromAtoB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}

