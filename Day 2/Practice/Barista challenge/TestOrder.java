import java.util.ArrayList;
public class TestOrder {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 2.5);
        Item item3 = new Item("drip coffee", 3.5);
        Item item4 = new Item("capuccino", 5);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Add items to order
        order1.addItem(item1);
        order1.addItem(item3);
        order2.addItem(item2);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item1);
        order4.addItem(item2);
        order2.setIsReady(true);
        System.out.println(order2.getStatusMessage());
        order4.setIsReady(true);
        System.out.println(order4.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order1.getStatusMessage());
        // display 
        System.out.println("********************Order1***********************");
        System.out.println(order1.getOrderTotal());
        System.out.println(order1.display());
        System.out.println("********************Order2***********************");
        System.out.println(order2.getOrderTotal());
        System.out.println(order2.display());
        System.out.println("********************Order3***********************");
        System.out.println(order3.getOrderTotal());
        System.out.println(order3.display());
        System.out.println("********************Order4***********************");
        System.out.println(order4.getOrderTotal());
        System.out.println(order4.display());
    }
}