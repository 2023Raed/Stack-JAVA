import java.util.ArrayList;
public class Order {
    // Member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items;
    // constructor
    public Order(){
        this.name="Guest";
        this.ready=ready;
        this.items=new ArrayList<Item>();
    }
    public Order (String name){
        this.name=name;
        this.ready=ready;
        this.items=new ArrayList<Item>();
        
    }
    // getters and setters
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean getIsReady() {
        return this.ready;
}
public void setIsReady(boolean ready){
    this.ready=ready;
}
public ArrayList<Item> getItems(){
    return this.items;
}
public void setItems(ArrayList<Item> items){
this.items=items;
}
public void addItem(Item item){
    this.items.add(item);
}
public String getStatusMessage(){
    if (getIsReady()==true) {
        return"Your order is ready";
       
    } else {
        return"Thank you for waiting. Your order will be ready soon.";
        
    }
}
public double getOrderTotal(){
    double orderTotal =0;
    for(Item item : items){
        orderTotal+= item.getPrice();
    }
    return orderTotal;
}
public String display(){
    String empty="";
    System.out.println(getName());
    for(Item item : items){
        empty.concat(item.getName() + "- $" + item.getPrice());
    }
return empty;
}
}
