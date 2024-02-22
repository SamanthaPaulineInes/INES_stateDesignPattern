package StatePattern;

public class ActiveState implements AccountState
{
    @Override
    public void deposit(Double depositAmount, Account account)
    {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.print("\n   Deposited: $" + depositAmount + "   Current balance: $" + account.getBalance() + "\n\n");
        account.toString();
    }
    @Override
    public void withdraw(Double withdrawAmount, Account account)
    {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.print("\n   Withdrawal: $" + withdrawAmount + "   Current balance: $" + account.getBalance() + "\n\n");
        account.toString();
    }
    @Override
    public void suspend(Account account)
    {
        account.setState(new SuspendedState());
        System.out.print("\n   Account is suspended!");
    }
    @Override
    public void activate(Account account)
    {
        System.out.print("\n   Account is already activated!");
    }
    @Override
    public void close(Account account)
    {
        account.setState(new ClosedState());
        System.out.print("\n   Account is closed!");
    }
}
