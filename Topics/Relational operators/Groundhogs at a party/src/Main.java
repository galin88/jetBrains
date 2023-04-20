import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCup = sc.nextInt();
        boolean weekend = sc.nextBoolean();

        if (numberOfCup >= 10 && numberOfCup <= 20 && !weekend) {
            System.out.println("true");
        } else if (numberOfCup >= 15 && numberOfCup <= 25 && weekend) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    // put your code here
    // You can use scanner.nextBoolean() to read a boolean value

}
