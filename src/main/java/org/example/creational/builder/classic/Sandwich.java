package org.example.creational.builder.classic;

public class Sandwich {
    private final String bread;
    private final String meat;
    private final String topping;

    private Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.topping = builder.topping;
    }

    public static class Builder {
        private final String bread;
        private final String meat;
        private String topping;

        public Builder(String bread, String meat) {
            this.bread = bread;
            this.meat = meat;
        }

        public Builder addTopping(String topping) {
            this.topping = topping;

            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich.Builder("Wheat", "Turkey")
                .addTopping("Lettuce")
                .build();
    }

}
