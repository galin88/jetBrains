import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int i = 1;

        while (i * i <= limit) {
            System.out.println(i * i);
            i++;

        }

    }

}
