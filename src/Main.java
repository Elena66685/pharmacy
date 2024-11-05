import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Medicines medicines = new Medicines("Максавит","Анальгин", 100);
        Medicines n = new Medicines("Фармани", "Спазмалгон", 45);
        Medicines v = new Medicines("Оптика", "Фурацилин", 897);
        Medicines f = new Medicines("Центральная", "Афобазол", 83);
        medicines.addMedicine(medicines);
        medicines.addMedicine(n);
        medicines.addMedicine(v);
        medicines.addMedicine(f);
        medicines.listMedicine();
        //Sales g = new Sales("apt", "ghj", 100, "fgh", 456, 456);
        //System.out.println(g);
        Medicines.sortByPrice = false;
        medicines.sor();

    }
}