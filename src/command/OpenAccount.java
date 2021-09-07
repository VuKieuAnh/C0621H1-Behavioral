package command;

public class OpenAccount implements Command {
    Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    public OpenAccount() {
    }

    @Override
    public void execute() {
        account.open();
    }
}
