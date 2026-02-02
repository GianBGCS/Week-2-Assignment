public class Main {
  public static void main(String[] args) {
    
    Language filipino = new Language("Filipino", 90000000);

        Country ph = new Country("Philippines", "Manila", 19000000, filipino);

        System.out.println(ph.getCountryInfo());
  }
}
