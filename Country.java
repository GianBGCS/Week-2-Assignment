public class Country {
    private String country_name;
    private City city;
    private Language language;

    public Country(String country_name, String city_name, int city_pop, Language language) {
        this.country_name = country_name;
        this.city = new City(city_name, city_pop);
        this.language = language;
    }

    public String getIdentity() {
        return "I am the Country Class. I act as the central hub connecting Geography, People, and Speech.";
    }

    public String getCountryInfo() {
        return "--- COUNTRY REPORT: " + country_name + " ---\n" +
                getIdentity() + "\n" +
                language.getIdentity() + "\n" +
                city.getIdentity() + "\n\n" +
                "Details:\n" +
                "Language: " + language.getLanguageInfo() + " speakers"+ "\n" +
                "City: " + city.getCityInfo() + " people";
    }
}