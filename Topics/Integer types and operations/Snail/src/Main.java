import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();

        int fullDay = 1 + (height - day) / (day - night);
        int partDay = (height - day) % (day - night);
        if (partDay > 0) {
            System.out.println(fullDay + 1);
        } else {
            System.out.println(fullDay);
        }
    }
}