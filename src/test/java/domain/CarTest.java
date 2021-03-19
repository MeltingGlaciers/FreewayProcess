package domain;


import org.junit.Before;
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
        assert car.getStatus() == CarStatus.OK;

    }

}
