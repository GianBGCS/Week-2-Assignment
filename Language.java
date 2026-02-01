public class Language{
    private String language_name;
    private int speakers;

    public Language(String language_name, int speakers) {
        this.language_name = language_name;
        this.speakers = speakers;
    }
    public String getLanguageInfo() {
        return language_name + ", " + speakers;
    }
    public String getIdentity() {
        return "I am the Language Class. I hold details about the primary tongue of the nation.";
    }
}