package StatePattern;
public class Account
{
    String accountNumber;
    Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }
    public void deposit(Double depositAmount)
    {
        accountState.deposit(depositAmount, this);
    }
    public void withdraw(Double withdrawAmount)
    {
        accountState.withdraw(withdrawAmount, this);
    }
    public void suspend()
    {
        accountState.suspend(this);
    }
    public void activate()
    {
        accountState.activate(this);
    }
    public void close()
    {
        accountState.close(this);
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setState(AccountState state)
    {
        this.accountState = state;
    }
    @Override
    public String toString()
    {
        System.out.print("Account Number: " + accountNumber + ", Balance: $" + balance);
        return "";
    }
}
