import java.util.ArrayList;
import java.util.Collections;

public class Medicines implements Comparable<Medicines> {
    private String name;
    private  String nameMedicine;
    private int priceMedicine;
    private ArrayList<Medicines> medicines = new ArrayList<>();
    public static boolean sortByPrice=true;

    public Medicines(String name, String nameMedicine, int priceMedicine) {
        this.name = name;
        this.nameMedicine = nameMedicine;
        this.priceMedicine = priceMedicine;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public String getName() {
        return name;
    }

    public int getPriceMedicine() {
        return priceMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceMedicine(int priceMedicine) {
        this.priceMedicine = priceMedicine;
    }

    @Override
    public String toString(){
        return this.name + " " + this.nameMedicine + " " + this.priceMedicine;
    }

    public void addMedicine (Medicines ob) {
        medicines.add(ob);
        //System.out.println(medicines);
    }

    public void listMedicine() {
        System.out.println(medicines);
    }

    @Override
    public int compareTo(Medicines o){
        if(sortByPrice)
            return this.priceMedicine - o.priceMedicine;
        else
            return nameMedicine.compareTo(o.nameMedicine);
    }

    public void sor() {
        Collections.sort(medicines);
        System.out.println(medicines);
    }

}
