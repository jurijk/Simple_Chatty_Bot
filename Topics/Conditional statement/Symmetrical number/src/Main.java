import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit1 = num / 1000;
        int digit2 = (num - digit1 * 1000) / 100;
        int digit3 = (num - digit1 * 1000 - digit2 * 100) / 10;
        int digit4 = num % 10;

        if (digit1 == digit4 && digit2 == digit3) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }

    }
}