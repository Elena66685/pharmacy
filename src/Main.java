import java.util.*;

public class Main {
    public static void main(String[] args) {

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