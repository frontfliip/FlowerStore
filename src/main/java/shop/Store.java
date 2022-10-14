package shop;

import java.util.List;
import java.util.Scanner;

public class Store {

    private Inventory inventory = new Inventory();

    public static void main(String[] args) {
        startCustomerInteraction();

        Store store = new Store();
        FlowerBucket bucket = new FlowerBucket();



        while(true) {

            List<Flower> matchingFlowers = store.search(inputCriteria());

            Flower chosenFlower = getChoice(matchingFlowers);
            int quantity = getQuantity();

            FlowerPack newPack = new FlowerPack(chosenFlower, quantity);
            bucket.add(newPack);

            if (!wantMore()) {
                break;
            }
        }

        double finalPrice = bucket.getPrice();

        if (store.confirmPayment(finalPrice)) {
            System.out.println("Thanks for ordering!");;
        } else {
//            callOmon();
        }
    }

    private static void startCustomerInteraction() {
        System.out.println("Welcome to our store of flowers!");
        System.out.println();
    }
    private static Criteria inputCriteria(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please input the criteria of your search");


        System.out.println("Enter the type of the flower");
        FlowerType type = FlowerType.valueOf(sc.nextLine());
        System.out.println();

        System.out.println("Enter the color of the flower");
        FlowerColor  color = FlowerColor.valueOf(sc.nextLine());
        System.out.println();

        System.out.println("Enter the max price for one flower");
        double maxPrice = sc.nextDouble();
        System.out.println();

        return new Criteria(type, color, maxPrice);
    }
    private List<Flower> search (Criteria criteria){
        return inventory.search(criteria);
    }
    private static Flower getChoice(List <Flower> flowers){
        Scanner sc  = new Scanner(System.in);
        flowers.forEach(flower -> System.out.println(flower));
        System.out.println("Enter your choice");
        return flowers.get(sc.nextInt());
    }
    private static int getQuantity() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Okey, skiko nado?");
        return sc.nextInt();
    }
    private static boolean wantMore(){
        System.out.println("Is that all? (yes/no)");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s.equals("no");
    }
    private static boolean confirmPayment(double finalPrice){
        System.out.println("The final price is " + finalPrice + "");
        return true;
    }
}
