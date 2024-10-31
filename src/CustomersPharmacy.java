public class CustomersPharmacy extends Pharmacy {
    private String surnameClient;
    private String nameClient;
    private String patronymicClient;
    private String discount;

    public CustomersPharmacy(String name, String surnameClient, String nameClient, String patronymicClient, String discount) {
        super(name);
        this.surnameClient = surnameClient;
        this.nameClient = nameClient;
        this.patronymicClient = patronymicClient;
        this.discount = discount;
    }

    public String getSurnameClient() {
        return surnameClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public String getPatronymicClient() {
        return patronymicClient;
    }

    public String getDiscount() {
        return discount;
    }


    public void setSurnameClient(String surnameClient) {
        this.surnameClient = surnameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setPatronymicClient(String patronymicClient) {
        this.patronymicClient = patronymicClient;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}


