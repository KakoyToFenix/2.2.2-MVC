package web.model;

public class Car {
    private String nameCar;
    private String colorCar;
    private int year;

    public Car(String nameCar, String colorCar, int year) {
        this.nameCar = nameCar;
        this.colorCar = colorCar;
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                '}';
    }
}
