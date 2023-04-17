public class BankAccount {
    // Member variables
    private double checkingBalance;
    private double savingBalance;
    public static int numberOfAccounts=0;
    public static double totalAmount=0;
    // constructor
    public BankAccount(double checkingBalance, double savingBalance){
        this.checkingBalance=checkingBalance;
        this.savingBalance=savingBalance;
        numberOfAccounts++;
        totalAmount=checkingBalance+savingBalance;
           }
        // getters and setters
    
public  double getCheckingBalance(){
    return this.checkingBalance;

}
public void setCheckingBalance(double checkingBalance){
    this.checkingBalance=checkingBalance;
}
public double getSavingBalance(){
    return this.savingBalance;

}
public void setSavingBalance(double savingBalance){
this.savingBalance=savingBalance;
}
//  other Methods

    public void deposit(String accountType,double amount){
        if(accountType.equals("checking")){
            setCheckingBalance(getCheckingBalance()+amount);
        }
        else if(accountType.equals("saving")){
            setSavingBalance(getSavingBalance()+amount);
        }
        totalAmount += amount;
    }
    public void withdraw(String accountType,double amount){
        if (accountType.equals("checking"))
        if (amount<=getCheckingBalance()) {
            setCheckingBalance(getCheckingBalance()-amount);
            totalAmount-=amount;
        }
        else{
            System.out.println("Insufficient Funds");
        }
        else if(accountType.equals("savings")){
            if(amount<=getSavingBalance()){
                setSavingBalance(getSavingBalance()-amount);
                totalAmount-=amount;
            }

        }

    }
    public double totalBalance() {
        return totalAmount;
    }
}



