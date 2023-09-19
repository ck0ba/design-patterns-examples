package org.example.creational.builder.parametrized;

public class House {
    private String foundation;
    private String roof;

    public static class Builder<T extends Builder<T>> {
        private String foundation;
        private String roof;

        public T withFoundation(String foundation) {
            this.foundation = foundation;
            return (T) this;
        }

        public T withRoof(String roof) {
            this.roof = roof;
            return (T) this;
        }

        public House build() {
            return new House(this);
        }
    }

    protected House(Builder<?> builder) {
        this.foundation = builder.foundation;
        this.roof = builder.roof;
    }

    public static void main(String[] args) {
        House house = new House.Builder<>()
                .withFoundation("concrete")
                .withRoof("tiles")
                .build();
    }
}
