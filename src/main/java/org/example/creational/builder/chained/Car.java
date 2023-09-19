package org.example.creational.builder.chained;

public class Car {
    private String brand;
    private String model;
    private int year;

    public static class Builder {
        private String brand;
        private String model;
        private int year;

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withYear(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
    }

    public static void main(String[] args) {
        Car car = new Car.Builder().withBrand("Toyota").withModel("Corolla").withYear(2023).build();
    }
}
