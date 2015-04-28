package net.owlsoft.hib01.model;


/**
 * Created by Perry on 21-Apr-15.
 */
public class Car {
    private int id;
    private String name;
    private String color;
    private Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(String name, String color, Engine engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    public Car() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
