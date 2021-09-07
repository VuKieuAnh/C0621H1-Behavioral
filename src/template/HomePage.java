package template;

public class HomePage extends PageTemplate {
    @Override
    protected void showBody() {
        System.out.println("Ds sp moi nhat");
    }

    public static void main(String[] args) {
        PageTemplate home = new HomePage();
        home.showPage();
    }
}
