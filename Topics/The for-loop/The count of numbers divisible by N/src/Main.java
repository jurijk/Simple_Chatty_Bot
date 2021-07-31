import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numN = scanner.nextInt();
        int count = 0;
        if (numA >= numN || numB >= numN) {
            count++;
        }
        count += (numB - numA) / numN;
        System.out.println(count);

    }
}