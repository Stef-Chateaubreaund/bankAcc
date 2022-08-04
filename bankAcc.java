public class BankAcc{
    private double savingsBalance;
    private double checkingBalance;
    private static int numberOfAccounts = 0;
    private static double totalMoneyAllAccounts = 0;
}

//constructor 
public BankAcc(){
    this.savingsBalance = 0;
    this.checkingBalance = 0;
    numberOfAccounts++;//increases ++
}//colocar tudo juntinho agora e chamar o .this
public BankAcc(double, savingsBalance, double checkingBalance){
    this.savingsBalance = savingsBalance;
    this.checkingBalance = checkingBalance;
    numberOfAccounts++;
    totalMoneyAllAccounts += savingsBalance;
    totalMoneyAllAccounts += checkingBalance;
}
// getter essa parte eu nao sei fazer 
public double getCheckingBalance(){
    return this.checkingBalance;
} //same fot saving now
public double getSavingsBalance(){
    return this.savingsBalance;
}
public double getTotalMoneyAllAccounts(){
    return this.totalMoneyAllAccounts;
}    
//setter 
    public void setTotalMoneyAllAccounts(double savingsBalance, double checkingBalance){
    totalMoneyAllAccounts = this.checkingBalance + this.savingsBalance;
}
    public double depositSavingsBalance(double amount){
        totalMoneyAllAccounts += amount;
        return this.savingsBalance += amount;
    }
    public double depositCheckingBalance(double amount){
        totalMoneyAllAccounts += amount;
        return this.checkingBalance += amount;
    }

//methods
//Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.

    public void withdrawSavingsBal(double amount){
        if(this.savingsBalance - amount > 0.0){
            this.savingsBalance -= amount;
        }
        if(amount > this.savingsBalance){
            System.out.println("voce nao tem dim dim suficiente ");
        }
    }

    //show all of i t
    public void display(){
        System.out.println("isso e o seu total:   "+ (this.savingsBalance + this.checkingBalance));
        }
    
  // NINJA BONUS: Create a private method that returns a random ten digit account
    // number.
    private long getAccountNumber() {
        accountNumber = (long) (Math.random() * 10000L);
        return accountNumber;
    }
