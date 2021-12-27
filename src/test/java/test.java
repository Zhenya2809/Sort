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


        TreeSet<Car> set2 = new TreeSet<>(new EngineCapacityComparator());

        set2.add(mercedes);
        set2.add(bmw);
        set2.add(hyundai);

//        Set<Car> set1 = new TreeSet<>(Comparator.comparingInt(Car::getEngineCapacity));
//        set1.add(mercedes);
//        set1.add(bmw);
//        set1.add(hyundai);
//        Assertions.assertEquals(set1.toString(), "[год выпуска 2019 емкость двигателя 2000\n" +
//                ", год выпуска 2020 емкость двигателя 3999\n" +
//                ", год выпуска 2016 емкость двигателя 5599\n" +
//                "]");
        Assertions.assertEquals(set2.toString(), "[год выпуска 2019 емкость двигателя 2000\n" +
                ", год выпуска 2020 емкость двигателя 3999\n" +
                ", год выпуска 2016 емкость двигателя 5599\n" +
                "]");

    }

}
