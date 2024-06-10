public class Car implements Comparable<Car> {
    private String modelName;
    private int year;

    public Car(String modelName, int year) {
        this.modelName = modelName;
        this.year = year;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", year=" + year +
                '}';
    }
}
