package command;

public class RaiseAccount implements Command {
    Account account;

    public RaiseAccount(Account account) {
        this.account = account;
    }

    public RaiseAccount() {
    }

    @Override
    public void execute() {
        account.raise();
    }
}
