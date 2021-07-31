import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one1 = scanner.nextInt();
        int one2 = scanner.nextInt();
        int one3 = scanner.nextInt();

        System.out.println(one1 != one2 && one2 != one3 && one1 != one3);
    }
}