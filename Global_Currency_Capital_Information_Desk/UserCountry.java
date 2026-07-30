package Global_Currency_Capital_Information_Desk;

import java.util.Scanner;

public class UserCountry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CurrencyDeskManager currencyDeskManager = new CurrencyDeskManager();
        currencyDeskManager.addCountry(new Country("India" ,
                "New Delhi" , "Rupess" , 1500000L));
        currencyDeskManager.addCountry(new Country("USA"
        , "Washington" , "Dollar" , 100502L));
        currencyDeskManager.addCountry(new Country("Nepal" ,
                "Kathmandu" , "Nepali Rupess" , 1522L ));
        currencyDeskManager.addCountry((new Country("Japan" ,
                "Tokyo" , "Yen" , 5615L)));
    while (true){
        System.out.println("1. Search Country : ");
        System.out.println("2. Display all Country : ");
        System.out.println("3. Exit ");
        System.out.print("Enter Choice : ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice){
            case 1 ->
            {
                System.out.print("Search Country  --:  ");
                String Searching = input.nextLine();
                currencyDeskManager.getCountryDetails(Searching);
            }
            case 2 -> {
                System.out.println("Display All Country : ");
                currencyDeskManager.displayAllCountries();
            }
            case 3 ->
            {System.out.println("Thanks You use the Country Currency System 👍");
                System.exit(0);

            }
            default -> System.out.println("❌ Invalid Choice! Please enter between 1 and 3.");
        }

    }

    }
}
