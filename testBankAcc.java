public class TestBankAcc {
    
    public static void main(String[] args) {
        BankAcc bank1 = new BankAcc();
        bank1.depositCheckingBalance(100);
        bank1.withdrawSavingsBalance(250);
        bank1.display();
        System.out.println(bank1.getCheckingBalance() + bank1.getSavingsBalance());
    }

//do i need 2? accounts?
}