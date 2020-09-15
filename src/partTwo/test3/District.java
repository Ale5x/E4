package partTwo.test3;

public class District {

    /*
    Создаем переменные класса "Район". Район имеет переменные: население и площадь
     */

    City city = new City();

    private int sumDistrictPopulation;
    private double sumDistrictSquare;
    private String districtName;

    /*
        Значение населения района имеет общую сумму всего населения района, поэтому устанавливаем
     значение населения города
     */
    public void setDistrictPopulation(int districtPopulation) {
        city.setPopulation(districtPopulation);
    }

    /*
        Значение площади района имеет общую сумму всей площади района, поэтому устанавливаем
     значение площади города

     */
    public void setDistrictSquare(double districtSquare) {
        city.setSquare(districtSquare);
    }

    /*
        Получение значения населения района, путём суммирования населения городов, входящих в этот район
     */
    public int getDistrictPopulation() {
        sumDistrictPopulation = city.getPopulation();
        return sumDistrictPopulation;
    }

    /*
        Получение значения площади района, путём суммирования площади городов, входящих в этот район
     */
    public double getDistrictSquare() {
        sumDistrictSquare = city.getSquare();
        return sumDistrictSquare;
    }

    /*
    Получаем значение: имя города
     */
    public String getCityDistrict() {
        return city.getCity();
    }

    /*
       Устанавливаем значение: имя города
    */
    public void setCityDistrict(String cityName) {
        city.setCity(cityName);
    }

    /*
   Получаем значение: имя района
    */
    public String getDistrictName() {
        return districtName;
    }

    /*
       Устанавливаем значение: имя района
    */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}