package template;

public class Detail extends PageTemplate {
    @Override
    protected void showBody() {
        System.out.println("Chi tiet bai viet");
    }

    public static void main(String[] args) {
        PageTemplate detail = new Detail();
        detail.showPage();
    }
}
