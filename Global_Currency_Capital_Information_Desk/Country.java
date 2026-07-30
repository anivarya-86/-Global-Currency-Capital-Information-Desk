package Global_Currency_Capital_Information_Desk;

public class Country {

    private  String CountryName;
    private  String Capital;
    private  String Currency;
    private long population;

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Country(String countryName, String capital, String currency, long population) {
        CountryName = countryName;
        Capital = capital;
        Currency = currency;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "CountryName='" + CountryName + '\'' +
                ", Capital='" + Capital + '\'' +
                ", Currency='" + Currency + '\'' +
                ", population=" + population +
                '}';
    }
}
