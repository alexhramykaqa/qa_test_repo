import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        MenuMain menu;
        try {
            menu = new MenuMain();
            menu.change();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        }
    }
}