public class Car implements Comparable<Car> {
    private final int yearOfManufacture;
    private final int engineCapacity;

    public Car(int yearOfManufacture, int engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "год выпуска " + yearOfManufacture +
                " емкость двигателя " + engineCapacity + "\n";
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.yearOfManufacture, car.getYearOfManufacture());
//        if(this.yearOfManufacture==car.getYearOfManufacture()){
//            return 0;
//        }
//        if(this.yearOfManufacture< car.getYearOfManufacture()){
//            return -1;
//        }
//        return 1;
    }
}


//Создать список автомобилей и отсортировать его по году производства.
//Создать̆ TreeSet автомобилей в котором они будут отсортированы по объему двигателя по возрастанию.