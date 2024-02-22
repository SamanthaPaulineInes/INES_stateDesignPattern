package StatePattern;

public class SuspendedState implements AccountState
{
    @Override
    public void deposit(Double depositAmount, Account account)
    {
        System.out.print("\n   You cannot deposit on a suspended account!\n");
        account.toString();
    }
    @Override
    public void withdraw(Double withdrawAmount, Account account)
    {
        System.out.print("\n   You cannot withdraw from a suspended account!\n");
        account.toString();
    }
    @Override
    public void suspend(Account account)
    {
        System.out.print("\n   Account is already suspended!");
    }
    @Override
    public void activate(Account account)
    {
        account.setState(new ActiveState());
        System.out.print("\n   Account is activated!");
    }
    @Override
    public void close(Account account)
    {
        account.setState(new ClosedState());
        System.out.print("\n   Account is closed!");
    }
}
