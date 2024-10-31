public class PharmacysDrugFund extends Pharmacy {
    private  String nameMedicine;
    private String typeMedicine;
    private int priceMedicine;
    private String country;

    public PharmacysDrugFund(String name, String nameMedicine, String typeMedicine, int priceMedicine, String country) {
        super(name);
        this.nameMedicine = nameMedicine;
        this.typeMedicine = typeMedicine;
        this.priceMedicine = priceMedicine;
        this.country = country;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public String getTypeMedicine() {
        return typeMedicine;
    }

    public int getPriceMedicine() {
        return priceMedicine;
    }

    public String getCountry() {
        return country;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public void setTypeMedicine(String typeMedicine) {
        this.typeMedicine = typeMedicine;
    }

    public void setPriceMedicine(int priceMedicine) {
        this.priceMedicine = priceMedicine;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

