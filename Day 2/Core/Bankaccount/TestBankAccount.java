public class TestBankAccount{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(15,12);
        account1.deposit("saving",25);
        account1.deposit("cheking",15);
        System.out.println(BankAccount.totalAmount);
        account1.withdraw("saving",10);
        System.out.println(account1.totalBalance());

    }

}
