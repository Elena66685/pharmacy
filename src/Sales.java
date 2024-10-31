public class Sales extends Pharmacy {
    private String name;
    private  String nameMedicine;
    private int priceMedicine;
    private String client;
    private int quantity;
    private int sum;

    public Sales(String name, String nameMedicine, int priceMedicine, String client, int quantity, int sum){
        super(name);
        this.nameMedicine = nameMedicine;
        this.priceMedicine = priceMedicine;
        this.client = client;
        this.quantity = quantity;
        this.sum = sum;
    }

    @Override
    public String toString(){
        return super.getName() + ", " + this.nameMedicine + ", " + this.priceMedicine + ", " + this.client + ", " + this.quantity + ", " + this.sum;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public int getPriceMedicine() {
        return priceMedicine;
    }

    public String getClient() {
        return client;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSum() {
        return sum;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public void setPriceMedicine(int priceMedicine) {
        this.priceMedicine = priceMedicine;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
