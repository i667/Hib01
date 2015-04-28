package net.owlsoft.hib01.model;

/**
 * Created by Perry on 21-Apr-15.
 */
public class Engine {
    private int id;
    private String make;
    private String model;
    private Car car;

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Engine() {
    }

    public Engine(String make, String model, Car car) {

        this.make = make;
        this.model = model;
        this.car = car;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
