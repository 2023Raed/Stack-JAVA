public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripcoffeePrice=5.25;
        double lattePrice=4.5;
        double cappuccinoPrice=4.75;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2="Sam";
        String customer3="Jimmy";
        String customer4="Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        // if statements Sam************************
        if(isReadyOrder2) {
            
            System.out.println(readyMessage+customer2+displayTotalMessage+2*lattePrice);
        } else {
            System.out.println(generalGreeting + customer2+pendingMessage);
        }
    

        boolean isReadyOrder3 = true;
        // if statements Jimmy************************
        if(isReadyOrder3) {
            
            System.out.println(readyMessage+customer3+displayTotalMessage+lattePrice+dripcoffeePrice);
        } else {
            System.out.println(generalGreeting + customer3+pendingMessage);
        }

        boolean isReadyOrder4= false;
        
         
        // if statements Noah************************
        if(isReadyOrder4) {
            System.out.println(generalGreeting + customer4+pendingMessage);
            
        } else {
            System.out.println(readyMessage+customer4+displayTotalMessage+cappuccinoPrice);
        }

        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1+pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(readyMessage+customer2+displayTotalMessage);
        System.out.println(readyMessage+customer3+displayTotalMessage);
        System.out.println(generalGreeting + customer4+pendingMessage);
       
       
    }
}
