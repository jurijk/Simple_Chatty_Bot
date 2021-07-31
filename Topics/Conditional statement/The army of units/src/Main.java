import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enemies = scanner.nextInt();
        if (enemies < 1) {
            System.out.println("no army");
        } else if (enemies <= 19) {
            System.out.println("pack");
        } else if (enemies <= 249) {
            System.out.println("throng");
        } else if (enemies <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}