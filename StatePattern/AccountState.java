package StatePattern;
public interface AccountState
{
    void deposit(Double depositAmount, Account account);
    void withdraw(Double withdrawAmount, Account account);
    void suspend(Account account);
    void activate(Account account);
    void close(Account account);
}
