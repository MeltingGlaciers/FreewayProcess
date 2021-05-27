package data;

import data.entity.Car;
import data.entity.Freeway;
import org.junit.BeforeClass;
import org.junit.Test;

public class FreewayTest {

    static Freeway f;

    @BeforeClass
    public static void setUp() {

        f = new Freeway(10);

    }

    @Test
    public void test(){

        f.addCar(new Car(10));
        assert f.getCars().size()==1;

    }
}
