package shop;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Store {

    private final Inventory inventory = new Inventory();

    public static void main(String[] args) {
        startCustomerInteraction();

        Store store = new Store();
        FlowerBucket bucket = new FlowerBucket();

        do {
            List<Flower> matchingFlowers = store.search(inputCriteria());
            if (matchingFlowers.size() == 0) {
                System.out.println("There is no match for your criteria");
            } else {
                Flower chosenFlower = getChoice(matchingFlowers);
                int quantity = getQuantity();

                FlowerPack newPack = new FlowerPack(chosenFlower, quantity);
                bucket.add(newPack);
            }
        } while (wantMore());

        double finalPrice = bucket.getPrice();

        confirmPayment(finalPrice);

    }

    private static void startCustomerInteraction() {
        System.out.println("Welcome to our store of flowers!");
        System.out.println();
    }
    private static Criteria inputCriteria(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please input the criteria of your search");


        System.out.println("What flower do you want?");
        FlowerType type = null;
        while (type == null) {
            System.out.print("Available: ");
            Arrays.stream(FlowerType.values()).forEach(t -> System.out.print(t + " "));
            System.out.println();
            try {
                type = FlowerType.valueOf(sc.nextLine().toUpperCase());
            } catch (IllegalArgumentException ex) {
                System.out.println("Try again!");
            }
            System.out.println();
        }

        System.out.println("What color do you like?");
        FlowerColor color = null;
        while (color == null){
            System.out.print("Available: ");
            Arrays.stream(FlowerColor.values()).forEach(c -> System.out.print(c.userFriendly() + " "));
            System.out.println();
            try {
                color = FlowerColor.valueOf(sc.nextLine().toUpperCase());
            } catch (IllegalArgumentException ex){
                System.out.println("Try again!");
            }
            System.out.println();
        }

        System.out.println("What is you max budget for one flower?");
        double maxPrice = -1;
        while (maxPrice == -1) {
            try {
                maxPrice = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException ex){
                System.out.println("Try again!");
            }
            System.out.println();
        }

        System.out.println("What min sepal length do you want?");
        double sepalLength = -1;
        while (sepalLength == -1){
            try {
                sepalLength = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException ex){
                System.out.println("Try again!");
            }
            System.out.println();
        }

        return new Criteria(type, color, maxPrice, sepalLength);
    }
    private List<Flower> search (Criteria criteria){
        return inventory.search(criteria);
    }
    private static Flower getChoice(List <Flower> flowers){
        Scanner sc  = new Scanner(System.in);
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(i + ": " + flowers.get(i));
        }

        while(true) {
            System.out.println("Enter your choice: ");
            String intChoice = sc.nextLine();
            if (isInt(intChoice) && parseInt(intChoice) >= 0 && parseInt(intChoice) < flowers.size()) {
                return flowers.get(parseInt(intChoice));
            } else {
                System.out.println("Try again!");
            }
        }
    }
    private static int getQuantity() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Okey, how many?");

        while(true) {
            System.out.println("Enter quantity: ");
            String intChoice = sc.nextLine();
            if (isInt(intChoice) && parseInt(intChoice) > 0) {
                return parseInt(intChoice);
            } else {
                System.out.println("Try again!");
            }
        }
    }
    private static boolean wantMore(){
        System.out.println("Is that all? (yes/no)");
        Scanner sc = new Scanner(System.in);

        while (true){
            String option = sc.nextLine();
            if (option.equals("no")) {
                return true;
            } else if (option.equals("yes")){
                return false;
            } else {
                System.out.println("Try again!");
            }
        }
    }
    private static void confirmPayment(double finalPrice){
        if (finalPrice == 0) {
            System.out.println("Thanks for attending!");
        }
        else {
            System.out.println("The final price is " + finalPrice + "");
            System.out.println("Thanks for ordering!");
        }
    }

    private static boolean isInt(String str) {
        try {
            parseInt(str);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
