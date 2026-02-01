public class Country {
    private String country_name;
    private City city;
    private Language language;

    public Country(String country_name, String city_name, int city_pop, Language language) {
        this.country_name = country_name;
        this.city = new City(city_name, city_pop);
        this.language = language;
    }
}