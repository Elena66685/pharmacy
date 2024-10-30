import java.util.ArrayList;

public class Medicines {
    private  String nameMedicine;
    private ArrayList<Medicines> medicines = new ArrayList<>();

    public Medicines(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    @Override
    public String toString(){
        return this.nameMedicine;
    }

    public void addMedicine (Medicines ob) {
        medicines.add(ob);
        //System.out.println(medicines);
    }

    public void listMedicine() {
        System.out.println(medicines);
    }
}
