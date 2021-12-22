import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class test {
    @Test
    void sortAutotest() {
        Car mercedes = new Car(2020, 3999);
        Car bmw = new Car(2016, 5599);
        Car hyundai = new Car(2019, 2000);
        List<Car> car = new ArrayList<>();
        car.add(mercedes);
        car.add(bmw);
        car.add(hyundai);
        Collections.sort(car);
        car.forEach(System.out::println);
        List<Car> testCar = new ArrayList<>();
        testCar.add(bmw);
        testCar.add(hyundai);
        testCar.add(mercedes);
        testCar.forEach(System.out::println);
        Assertions.assertEquals(car, testCar);


    }

    @Test
    void treeSetSortTest() {

        Car mercedes = new Car(2020, 3999);
        Car bmw = new Car(2016, 5599);
        Car hyundai = new Car(2019, 2000);

        Set<Car> set = new TreeSet<>(Comparator.comparingInt(Car::getEngineCapacity));
        set.add(mercedes);
        set.add(bmw);
        set.add(hyundai);
        System.out.println(set);
        Assertions.assertEquals(set.toString(), "[год выпуска 2019 емкость двигателя 2000\n" +
                ", год выпуска 2020 емкость двигателя 3999\n" +
                ", год выпуска 2016 емкость двигателя 5599\n" +
                "]");


    }

}
