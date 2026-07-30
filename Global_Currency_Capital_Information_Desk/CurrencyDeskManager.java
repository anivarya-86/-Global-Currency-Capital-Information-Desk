package Global_Currency_Capital_Information_Desk;

import java.util.HashMap;
import java.util.Map;

public class CurrencyDeskManager {
    Map<String , Country> countryMap = new HashMap<>();

    public void addCountry(Country country){
     countryMap.put(country.getCountryName().toLowerCase() , country);
        System.out.println(country.getCountryName() + " -> Information add to Desk ");
    }
    public void getCountryDetails(String countryName){
        String SearchKey = countryName.toLowerCase().trim();
        if (countryMap.containsKey(SearchKey)){
            System.out.println("\n--- 🌐 COUNTRY DETAILS ---");
            Country country = countryMap.get(SearchKey);
            System.out.println(country);
        }else {
            System.out.println("Invalid " + countryName +  "is not exist in Database ");
        }

    }
    public void displayAllCountries(){
        if (countryMap.isEmpty()){
            System.out.println("-----DataBase is Empty--- ");
            return;
        }
        for (Map.Entry<String , Country> entry : countryMap.entrySet())
        {
            System.out.println("----------------------------------");
            System.out.println(entry.getValue());
            System.out.println("----------------------------------");
        }

    }

}
