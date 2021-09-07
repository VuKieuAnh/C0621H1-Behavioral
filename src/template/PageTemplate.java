package template;

public abstract class PageTemplate {
    protected void showHeader(){
        System.out.println("Ta la header day");
    }
    protected void showFooter(){
        System.out.println("Ta la footer day");
    }
    protected abstract void showBody();

    public final void showPage(){
        showHeader();
        showBody();
        showFooter();
    }
}
