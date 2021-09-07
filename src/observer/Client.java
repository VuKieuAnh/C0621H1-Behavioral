package observer;

public class Client {
    public static void main(String[] args) {
        Observer mail = new MailNotification();
        Observer app = new AppNotification();
        Observer phone = new PhoneNotification();
        Account kieuanhXinh = new Account();
        kieuanhXinh.add(mail);
        kieuanhXinh.add(app);

        kieuanhXinh.notification("Chuyen cho ck 10 tr");

        kieuanhXinh.remove(app);
        kieuanhXinh.add(phone);

        kieuanhXinh.notification("Ck cho ck 5tr");

    }
}
