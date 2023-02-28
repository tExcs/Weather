import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<City> cities = new ArrayList<>(); // LISTE ERZEUGEN
    public static void main(String[] args) {

        cities.add(new City("Roma", 26, "Sunny"));
        cities.add(new City("Berlin", 13, "Cloudy"));
        cities.add(new City("New York", 9, "Frosty"));
        cities.add(new City("Zurich", 2, "Cold"));
        cities.add(new City("Chur", -7, "Really Cold"));
        cities.add(new City("Tokyo", 15, "Rainy"));

        System.out.println("Welcome to the all new Weather App!"); // Welcome Message
        System.out.println("---------------------------------");

        int couter = 0;

        for (City city : cities) {
            couter++;
            System.out.println(couter + " " + city.name);
        }

        System.out.println();
        System.out.print("USER INPUT: ");
        Scanner scanner = new Scanner(System.in);
        String chose = scanner.nextLine();

        int chose_num =  Integer.parseInt(chose);

        City selected_city = cities.get(chose_num - 1);
        System.out.println(selected_city.name + " " + selected_city.temp + "°" + " " + selected_city.current_weather);



    }
}