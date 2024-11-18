import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String string1 = sc.nextLine();
        System.out.println("Введите вторую строку");
        String string2 = sc.nextLine();

        if (string1.equals(string2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}