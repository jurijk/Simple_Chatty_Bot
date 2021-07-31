import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numA = scanner.nextInt();
        long numB = scanner.nextInt();
        long prod = 1;
        for (long i = numA; i < numB; i++) {
            prod = prod * i;
        }
        System.out.println(prod);
    }
}