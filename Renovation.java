import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double widthFloor = Double.parseDouble(scanner.nextLine());
        double lenghtFloor = Double.parseDouble(scanner.nextLine());
        double sizeTrg = Double.parseDouble(scanner.nextLine());
        double heightTrg = Double.parseDouble(scanner.nextLine());
        double plochkaPrice = Double.parseDouble(scanner.nextLine());
        double workerPrice = Double.parseDouble(scanner.nextLine());

        double floorSize = widthFloor * lenghtFloor;
        double plochkaSize = sizeTrg * heightTrg / 2;
        double neededPlochki = Math.ceil(floorSize / plochkaSize) + 5;
        double totalPrice = (neededPlochki * plochkaPrice) + workerPrice;

        if (budget >= totalPrice) {
            System.out.printf("%.2f lv left.", budget - totalPrice);
        } else {
            System.out.printf("You'll need %.2f lv more.", totalPrice - budget);
        }

    }
}
