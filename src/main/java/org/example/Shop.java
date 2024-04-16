import java.util.ArrayList;
import java.util.Scanner;

class Order {
    String fullName;
    String email;
    String phoneNumber;
    String item;
    int quantity;

    public Order(String fullName, String email, String phoneNumber, String item, int quantity) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.item = item;
        this.quantity = quantity;
    }
}

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] companies = {"Fossil", "Casio", "Rolex"};
        String[][] products = {
                {"Fossil", "Sport", "Classic"},
                {"Casio", "G-Shock", "Edifice"},
                {"Rolex", "Submariner", "Datejust"}
        };

        ArrayList<Order> orders = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите данные для заказа " + (i + 1) + ":");

            System.out.print("ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Номер телефона: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Список доступных товаров:");
            for (int j = 0; j < companies.length; j++) {
                System.out.print(companies[j] + ": ");
                for (int k = 1; k < products[j].length; k++) {
                    System.out.print(products[j][k] + " ");
                }
                System.out.println();
            }

            System.out.print("Выберите товар (Фирма Марка): ");
            String item = scanner.nextLine();

            System.out.print("Введите количество: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            orders.add(new Order(fullName, email, phoneNumber, item, quantity));
        }

        System.out.println("Информация о заказах:");

        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            System.out.println("Заказчик: " + order.fullName);
            System.out.println("Email: " + order.email);
            System.out.println("Номер телефона: " + order.phoneNumber);
            System.out.println("Товар: " + order.item);
            System.out.println("Количество: " + order.quantity);
            System.out.println("\n\n\n");
            System.out.println();
        }
    }
}
