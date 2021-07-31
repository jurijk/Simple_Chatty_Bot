import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number100 = number % 100;
        int number10 = number100 % 10;
        System.out.println((number100 - number10) / 10);
    }
}