package JavaBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCart = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int memoryRam = Integer.parseInt(scanner.nextLine());
        double expenses = 0.00;

        if (videoCart > processor) {
            expenses = (videoCart * 250 + videoCart * 250 * 0.35 * processor +
                    memoryRam * videoCart * 250 * 0.1) * 0.85;

        } else {
            expenses = videoCart * 250 + videoCart * 250 * 0.35 * processor +
                    memoryRam * videoCart * 250 * 0.1;
        }
        if (expenses <= budget) {
            System.out.printf("You have %.02f leva left!", budget - expenses);
        } else {
            System.out.printf("Not enough money! You need %.02f leva more!", expenses - budget);
        }
    }
}
