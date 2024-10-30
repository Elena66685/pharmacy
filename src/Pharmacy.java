public class Pharmacy {
    private String name;
    private String address;
    private String city;
    private String director;

    public Pharmacy(String name, String address, String city, String director) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getDirector() {
        return director;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public class CustomersPharmacy {
        private String namePharmacy;
        private String surnameClient;
        private String nameClient;
        private String patronymicClient;
        private String discount;

        public CustomersPharmacy(String namePharmacy, String surnameClient, String nameClient, String patronymicClient, String discount) {
            this.namePharmacy = namePharmacy;
            this.surnameClient = surnameClient;
            this.nameClient = nameClient;
            this.patronymicClient = patronymicClient;
            this.discount = discount;
        }

        public String getNamePharmacy() {
            return namePharmacy;
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

        public void setNamePharmacy(String namePharmacy) {
            this.namePharmacy = namePharmacy;
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

    public class PharmacysDrugFund {
        private String namePharmacy;
        private  String nameMedicine;
        private String typeMedicine;
        private int priceMedicine;
        private String country;

        public PharmacysDrugFund(String namePharmacy, String nameMedicine, String typeMedicine, int priceMedicine, String country) {
            this.namePharmacy = namePharmacy;
            this.nameMedicine = nameMedicine;
            this.typeMedicine = typeMedicine;
            this.priceMedicine = priceMedicine;
            this.country = country;
        }

        public String getNamePharmacy() {
            return namePharmacy;
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

        public void setNamePharmacy(String namePharmacy) {
            this.namePharmacy = namePharmacy;
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

    public class Sales {
        private String namePharmacy;
        private  String nameMedicine;
        private int priceMedicine;
        private String client;
        private int quantity;
        private int sum;

    }
}
