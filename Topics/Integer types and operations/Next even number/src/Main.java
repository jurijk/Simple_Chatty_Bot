import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder = number % 2;
        System.out.println(number + (2 - remainder));
    }
}