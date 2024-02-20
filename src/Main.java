import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        int atmnumber = 12345;
        int atmPin = 1800;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать!");
        System.out.print("Введите номер карточки: ");

        int atmNumber = scanner.nextInt();
        System.out.print("Введите пин-код: ");
        int pin = scanner.nextInt();
        if ((atmnumber == atmNumber) && (atmPin == pin)) {
            while (true) {
                System.out.println("1. Проверить баланс\n2. Cнять сумму\n3. Внести сумму\n4. Выход");
                System.out.println("Выберите");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    account.checkBalance();


                } else if (choice == 2) {
                    System.out.println("Снять деньги ");
                    account.withdraw(scanner.nextInt());

                } else if (choice == 3) {
                    System.out.println("Внести сумму ");
                    account.deposit(scanner.nextInt());

                } else if (choice == 4) {
                    System.out.println("Заберите свою карту\n Благодорим за использование Банкомата!!!");
                    System.exit(0);

                } else {
                    System.out.println("Пожалуйста введите правильно ");
                }

            }

        } else {
            System.err.println("Неверный номер карты или пин-кода. ");
            System.exit(0);
        }

    }

}