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

    public Pharmacy(String name){
        this.name = name;
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
}
