/*19). Туристические туры
Tourist trip:
Свойства:
название тура; к
        страны; к
        города; к
тип передвижения; к
тип питания; к
цена тура;
тип проживания;
дата выезда;*/
public class TouristTrip implements Comparable<TouristTrip> {
    private String name;
    private String country;
    private String city;
    private String movement;
    private String nutrition;
    private int price;
    private String habitation;
    private String date;

    public TouristTrip(String name, String country, String city, String movement, String nutrition){
        this.name = name;
        this.country = country;
        this.city = city;
        this.movement = movement;
        this.nutrition = nutrition;
    }

    @Override
    public String toString(){
        return "Туристические туры \n" +
                "Название тура: " + this.name + "\n" +
                "Страна: " + this.country + "\n" +
                "Город: " + this.city + "\n" +
                "Тип передвижения: " + this.movement + "\n" +
                "Тип питания: " + this.nutrition + "\n";

    }

    @Override
    public int compareTo(TouristTrip o) {
        return name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getMovement() {
        return movement;
    }

    public String getNutrition() {
        return nutrition;
    }

    public int getPrice() {
        return price;
    }

    public String getHabitation() {
        return habitation;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHabitation(String habitation) {
        this.habitation = habitation;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

