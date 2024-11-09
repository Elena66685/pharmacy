import java.util.*;

public class Main {
    public static void main(String[] args) {
        //задание 3 вариант 21
        int length = 10;
        int nums[] = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++)
        {
            nums[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        int min = nums[0];
        for (int i = 1; i < 10; i++)
        {
            if (nums[i] <= min)
            {
                min = nums[i];
            }
        }
        System.out.println(min);
        for (int i = 0; i < length; i++)
        {
            nums[i] -= min;
        }
        System.out.println(Arrays.toString(nums));


        TouristTrip touristTrip = new TouristTrip ("Восточная сказка", "Россия", "Казань", "Теплоход", "Шведский стол");
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

        Medicines medicin = new Medicines("Максавит", "Анальгин", 100);
        Medicines n = new Medicines("Фармани", "Спазмалгон", 45);
        Medicines v = new Medicines("Оптика", "Фурацилин", 897);
        Medicines f = new Medicines("Центральная", "Афобазол", 83);
        medicin.addMedicine(medicin);
        medicin.addMedicine(n);
        medicin.addMedicine(v);
        medicin.addMedicine(f);
        medicin.listMedicine();
        //Sales g = new Sales("apt", "ghj", 100, "fgh", 456, 456);
        //System.out.println(g);
        Medicines.sortByPrice = false;
        medicin.sor();





    }
}