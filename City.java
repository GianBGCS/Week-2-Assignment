public class City {
    private  String city_name;
    private int population;

    public City(String city_name, int population){
        this.city_name = city_name;
        this.population = population;
    }
    public String getCityInfo() {
        return city_name + ", " + population;
    }
}