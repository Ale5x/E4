package partTwo.test3;

public class State {

    /*
    Создаем переменные класса "Штат/область". Штат/область имеет переменные: население и площадь
     */

    private District district = new District();

    private int statePopulation;
    private double stateSquare;
    private String capital;
    private String stateName;
    private String districtName;
    private String city;

    public State(String capital, String stateName, String districtName, String city, double Square, int population) {
        district.setDistrictPopulation(population);
        district.setDistrictSquare(Square);
        this.capital = capital;
        this.stateName = stateName;
        district.setDistrictName(districtName);
        district.setCityDistrict(city);
    }

    // получаем значение населения из районов -> городов
    public int getStatePopulation() {
        statePopulation = district.getDistrictPopulation();
        return statePopulation;
    }

    // получаем значение площади из районов -> городов
    public double getStateSquare() {
        stateSquare = district.getDistrictSquare();
        return stateSquare;
    }

    // получаем значение штат/области страны
    public String getStateName() {
        return stateName;
    }

    // Получаем значение столицы страны
    public String getCapital() {
        return capital;
    }

    // Получение значение имя района
    public String getDistrictName() {
        return district.getDistrictName();
    }

    // Значение города
    public String getCity() {
        return district.getCityDistrict();
    }
}

