import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int numM = scanner.nextInt();
        int numK = scanner.nextInt();
        if (numN == 0 || numM == 0 || numK == 0 || numN * numM < numK) {
            System.out.println("NO");
        } else if (numK % numN == 0 || numK % numM == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}