package StatePattern;
public class ClosedState implements AccountState
{
    @Override
    public void deposit(Double depositAmount, Account account)
    {
        System.out.print("\n   You cannot deposit on a closed account!\n\n");
        account.toString();
    }
    @Override
    public void withdraw(Double withdrawAmount, Account account)
    {
        System.out.print("\n   You cannot withdraw from a closed account!\n\n");
        account.toString();
    }
    @Override
    public void suspend(Account account)
    {
        System.out.print("\n   You cannot suspend a closed account!");
    }
    @Override
    public void activate(Account account)
    {
        System.out.print("\n   You cannot activate a closed account!");
    }
    @Override
    public void close(Account account)
    {
        System.out.print("\n   Account is already closed!");
    }
}
