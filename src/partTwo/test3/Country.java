package partTwo.test3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Country {

    /*
        Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
    столицу, количество областей, площадь, областные центры.
     */

    public static void main(String[] args) {

        List<State> countryList = new ArrayList<>();

        countryList.add(new State("Минск", "Гомель", "Светлогорский", "Светлогорск", 25.85, 67054));
        countryList.add(new State("Минск", "Минск", "Минск", "Минск", 348.58, 1975000));
        countryList.add(new State("Минск", "Гомель", "Гомель", "Гомель", 139.77, 508839));
        countryList.add(new State("Минск", "Гомель", "Жлобинский", "Жлобин", 32.92, 76078));
        countryList.add(new State("Минск", "Могилёв", "Могилёв", "Могилев", 118.5, 380440));
        countryList.add(new State("Минск", "Могилёв", "Бобруйск", "Бобруйск", 96.4, 217940));
        countryList.add(new State("Минск", "Витебск", "Витебск", "Витебск", 134.6, 362466));
        countryList.add(new State("Минск", "Другие области", "Другие районы", "Другие города", 207495, 9450000));

        outputDataCountry(countryList);
        getDataCountry(countryList);
        String state = "Гомель";
        getDataState(countryList, state);
        String district = "Светлогорский";
        getDataDistrict(countryList, district);

    }

    // Получение данных по стране (вывод данных о численности и площади страны, количестве областей и столицы страны)
    public static void getDataCountry(List<State> countryList) {
        int population = 0;
        double square = 0;
        String capital = "";

        Set<String> stateList = new HashSet<>();

        // Вывод значений: население и площадь страны
        for (State state : countryList) {
            stateList.add(state.getStateName());
            population += state.getStatePopulation();
            square += state.getStateSquare();
            capital = state.getCapital();
        }

        System.out.println("\nСтолица - " + capital + ". Колличество областей - " + stateList.size() +
                ". Население страны - " + population + " человек. Площадь городов - " + square + " кв.км");
        System.out.println("Областные центры: \n" + stateList.toString());
    }

    /*
       Получение данных по области
     */
    public static void getDataState(List<State> countryList, String state) {
        int population = 0;
        int square = 0;
        for(State country: countryList) {
            if(state.equalsIgnoreCase(country.getStateName())) {
                population += country.getStatePopulation();
                square += country.getStateSquare();
            }
        }
        System.out.println("\nНаселение области " + state + " составляет - " + population + " чел. Площадь области - "
                + square + " кв.км.");
    }

    // Вывод всего списка
    public static void outputDataCountry(List<State> countryList) {
        System.out.println("Вывод всего списка....");
        for (State state : countryList) {
            System.out.println("Штат " + state.getStateName() + ". Район " + state.getDistrictName() + ". Город " +
                    state.getCity() + " Населения города - " + state.getStatePopulation() + ". Площадь города " +
                    state.getStateSquare() + " кв. км");
        }
    }

    //Получение данных по району
    public static void getDataDistrict(List<State> countryList, String district) {
        int population = 0;
        double square = 0;

        for(State state : countryList) {
            if(district.equalsIgnoreCase(state.getDistrictName())) {
                population += state.getStatePopulation();
                square += state.getStateSquare();
            }
        }
        System.out.println("\nНаселение района " + district + " составляет: " + population
                + " чел. Площадь района " + square + " кв.км");
    }
}
