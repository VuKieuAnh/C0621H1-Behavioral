package command;

public class AppBanking {
    private Command openAccount;
    private Command raiseAccount;

    public AppBanking(Command openAccount, Command raiseAccount) {
        this.openAccount = openAccount;
        this.raiseAccount = raiseAccount;
    }
    public void clickOpen(){
        openAccount.execute();
    }
    public void clickRaise(){
        raiseAccount.execute();
    }
}
