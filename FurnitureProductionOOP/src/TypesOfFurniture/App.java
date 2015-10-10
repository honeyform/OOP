package TypesOfFurniture;

/**
 * Created by Honey on 20.09.2015.
 */
public class App {
    public static void main(String[] args) {
    System.out.println("Your order is consits of: ");
        Chair chair = new Chair();
        System.out.println(chair.toString());
        System.out.println();
        int costChair = chair.calculateCost();
        System.out.println("Price of this Furniture is: " + costChair);
        System.out.println();

        Desk desk = new Desk();
        System.out.println(desk.toString());
        System.out.println();
        int costDesk = desk.calculateCost();
        System.out.println("Price of this Furniture is: " + costDesk);
        System.out.println();

        System.out.println("THE COMMON PRICE OF THE ORDER IS " + (costChair+costDesk) + " UAN.");

    }
}
