package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders  && Objects.equals(name, car.name);
    }

    /*

        @Override
    public int hashCode() {
        return Objects.hash(engine, cylinders, name, wheels);
    }

     */
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

}
