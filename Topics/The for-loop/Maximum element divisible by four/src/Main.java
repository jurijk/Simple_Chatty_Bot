import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int numB = 0;
        int max = 0;
        for (int i = 0; i < numN; i++) {
            numB = scanner.nextInt();
            if (numB % 4 == 0 && numB > max) {
                max = numB;
            }
        }
        System.out.println(max);
    }
}