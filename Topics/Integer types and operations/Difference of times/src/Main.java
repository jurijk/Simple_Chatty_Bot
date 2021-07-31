import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursOne = scanner.nextInt();
        int minutesOne = scanner.nextInt();
        int secondsOne = scanner.nextInt();

        int hoursTwo = scanner.nextInt();
        int minutesTwo = scanner.nextInt();
        int secondsTwo = scanner.nextInt();

        int start = hoursOne * 3600 + minutesOne * 60 + secondsOne;
        int finish = hoursTwo * 3600 + minutesTwo * 60 + secondsTwo;

        System.out.println(finish - start);
    }
}