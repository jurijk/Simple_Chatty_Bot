import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numH = scanner.nextInt();
        if (numH < numA) {
            System.out.println("Deficiency");
        } else if (numH >= numA && numH <= numB) {
            System.out.println("Normal");
        } else if (numH > numB) {
            System.out.println("Excess");
        }
    }
}