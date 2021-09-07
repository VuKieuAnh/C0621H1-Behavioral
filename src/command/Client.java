package command;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Account kieuAnh = new Account("KA");
        Command open = new OpenAccount(kieuAnh);
        Command raise = new RaiseAccount(kieuAnh);
        AppBanking appBanking = new AppBanking(open, raise);
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a){
            case "O":
                appBanking.clickOpen();
                break;
            case "R":
                appBanking.clickRaise();
                break;

        }


    }
}
