import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = Integer.valueOf(scanner.nextLine());
            if (i <= -1) {
                break;
            }
            statistics.addNumber(i);
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

        scanner.close();
    }
}