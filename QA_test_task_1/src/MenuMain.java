import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMain {
    private final NumberClass number_one;
    private final NumberClass number_two;
    private final int choose;

    public MenuMain() throws InputMismatchException {
        System.out.println("Введите 1 число");
        Scanner sc = new Scanner(System.in);
        this.number_one = new NumberClass(sc.nextInt());
        System.out.println("Введите 2 число");
        sc = new Scanner(System.in);
        this.number_two = new NumberClass(sc.nextInt());
        System.out.println("Выберите действие");
        System.out.println("1. Сравнение\n2. Сложение\n3. Вычитание\n4. Умножение\n5. Деление\n6. Все операции");
        sc = new Scanner(System.in);
        this.choose = sc.nextInt();
    }

    public void change() {
        if (this.choose == 1) {
            compare();
        }
        if (this.choose == 2) {
            add();
        }
        if (this.choose == 3) {
            substract();
        }
        if (this.choose == 4) {
            multyply();
        }
        if (this.choose == 5) {
            divide();
        }
        if (this.choose == 6) {
            compare();
            add();
            substract();
            multyply();
            divide();
        }
    }

    public void compare() {
        System.out.println(number_one.compare(number_two));
    }

    public void add() {
        System.out.println("Сложение двух чисел = " + number_one.add(number_two));
    }

    public void substract() {
        System.out.println("Вычитание двух чисел = " + number_one.subtract(number_two));
    }

    public void multyply() {
        System.out.println("Умножение двух чисел = " + number_one.multiply(number_two));
    }

    public void divide() {
        System.out.println("Деление двух чисел = " + number_one.devide(number_two));
    }
}
