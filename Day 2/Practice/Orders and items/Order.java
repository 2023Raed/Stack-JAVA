import java.util.ArrayList;

public class Order {
    // member variables
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;
    // constructor
    public Order(String name) {
        this.name=name;
        this.total=total;
        this.ready= ready;
        this.items=new ArrayList<Item>();

}
public void addItem(Item item) {
    this.items.add( item);
}
}
