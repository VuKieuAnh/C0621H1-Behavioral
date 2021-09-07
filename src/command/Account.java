package command;

public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("tk " + name + " dc mo");
    }

    public void raise(){
        System.out.println("tk " + name + " dc nang cap");
    }
}
