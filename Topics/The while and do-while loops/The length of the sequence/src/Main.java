import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int counter = 0;
        do {
            number = scanner.nextInt();
            counter++;

        }
        while (number != 0);
        System.out.println(counter - 1);
    }
}