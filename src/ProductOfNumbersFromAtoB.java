import java.util.Scanner;

public class ProductOfNumbersFromAtoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long result = 1;
        for (int i = a; i < b; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}

