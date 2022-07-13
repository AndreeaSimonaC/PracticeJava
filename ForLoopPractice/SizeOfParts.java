import java.util.Scanner;

public class SizeOfParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sendToFix = 0;
        int remove = 0;
        int sendToBox = 0;
        int nextN;
        for (int i = 0; i < n; i++) {
            nextN = scanner.nextInt();
            if (nextN == 1) {
                sendToFix = sendToFix + 1;
            }
            if (nextN == -1) {
                remove++;
            }
            if (nextN == 0) {
                sendToBox++;
            }
        }
        System.out.print(sendToBox + " " + sendToFix + " " + remove);
    }
}
