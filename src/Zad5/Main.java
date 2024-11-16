package Zad5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TouristTrip touristTrip = new TouristTrip("Восточная сказка", "Россия", "Казань", "Теплоход", "Шведский стол");
        System.out.println(touristTrip);

        Scanner scanner = new Scanner(System.in);
        ArrayList<TouristTrip> touristTrips = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            // Вывести опции меню
            System.out.println("Меню:");
            System.out.println("1. Добавить тур");
            System.out.println("2. Просмотр туров");
            System.out.println("3. Выход");
            // Вывести запрос на ввод
            System.out.print("Введите выбранный вами вариант: ");
            // Считать выбор пользователя
            int choice = scanner.nextInt();
            // Обработать выбор пользователя
            switch (choice) {
                case 1:
                    // Выполнить действия для опции 1
                    scanner.nextLine();
                    System.out.println("Введите название тура:");
                    String name = scanner.nextLine();
                    System.out.println("Введите страну:");
                    String country = scanner.nextLine();
                    System.out.println("Введите город:");
                    String city = scanner.nextLine();
                    System.out.println("Введите тип передвижения:");
                    String movement = scanner.nextLine();
                    System.out.println("Введите тип питания:");
                    String nutrition = scanner.nextLine();
                    touristTrips.add(new TouristTrip(name, country, city, movement, nutrition));
                    System.out.println(touristTrips);
                    break;
                case 2:
                    // Выполнить действия для опции 2
                    Collections.sort(touristTrips);
                    System.out.println(touristTrips);
                    break;
                case 3:
                    // Выйти из программы
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите правильный вариант!");
                    break;
            }
        }
// Закрыть сканер после завершения работы
        scanner.close();
    }
}