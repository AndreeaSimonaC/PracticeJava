import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numberofAs = 0;
        int numberofBs = 0;
        int numberofCs = 0;
        int numberofDs = 0;
        String nextGrade;
        for (int i = 0; i < n; i++) {
            nextGrade = scanner.next();
            if ("A".equals(nextGrade)) {
                numberofAs++;
            } else if ("B".equals(nextGrade)) {
                numberofBs++;
            } else if ("C".equals(nextGrade)) {
                numberofCs++;
            } else if ("D".equals(nextGrade)) {
                numberofDs++;
            }
        }

        System.out.println(numberofDs + " " + numberofCs + " " + numberofBs + " " + numberofAs);

    }
}

