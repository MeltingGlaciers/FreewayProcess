package data;


import data.entity.Car;
import org.junit.BeforeClass;
import org.junit.Test;


public class CarTest {

    static Car car;

    @BeforeClass
    public static void setUp() {

        car = new Car(20);

    }

    @Test
    public void carTest(){
        car = new Car(20);
       // assert car.getStatus() == CarStatus.OK;

    }

    @Test
    public void test(){
        System.out.println(CarStatus.OK);

    }

}
