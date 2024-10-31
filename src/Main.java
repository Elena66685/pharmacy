
public class Main {
    public static void main(String[] args) {
        Medicines medicines = new Medicines("Анальгин");
        Medicines n = new Medicines("Спазмалгон");
        Medicines v = new Medicines("Фурацилин");
        medicines.addMedicine(medicines);
        medicines.addMedicine(n);
        medicines.addMedicine(v);
        medicines.listMedicine();
        Sales g = new Sales("apt", "ghj", 100, "fgh", 456, 456);
        System.out.println(g);

    }
}