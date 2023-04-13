import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks){
        int sum = 0 ;
        
        for (int i=0; i<=numWeeks; i++){
            sum+=i;           
        }
        return sum;
    } 

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i=0; i< prices.length; i++){
            sum+= prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i< menuItems.size(); i++){
            System.out.println(i + ": " + menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("please enter your name");
        String userName = System.console().readLine();
        System.out.println("hello,"+userName);
        System.out.println ("there are "+ customers.size()+" people in front of you");
        customers.add(userName);
        
        for (int i=0; i< customers.size(); i++){
            
            System.out.println(customers.get(i));
        }

    }
}

