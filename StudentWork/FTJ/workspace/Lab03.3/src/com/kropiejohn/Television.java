package com.kropiejohn;

class Television {
    private String brand;

    private int volume;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    public Television() {
    }

    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        // basic validation before setting the volume
        volume = Math.max(volume, MIN_VOLUME);
        volume = Math.min(volume, MAX_VOLUME);

        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Television that = (Television) o;

        if (volume != that.volume) return false;
        return brand != null ? brand.equals(that.brand) : that.brand == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + volume;
        return result;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }
}