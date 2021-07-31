import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        int numD = scanner.nextInt();
        int count = 0;
        for (int x = 0; x <= 1000; x++) {
            if (numA * x * x * x + numB * x * x + numC * x + numD == 0) {
                count++;
                System.out.println(x);
            }
            if (count == 3) {
                return;
            }
        }
    }
}