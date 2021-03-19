package domain;

import org.junit.BeforeClass;
import org.junit.Test;

public class FreewayProcessTest {

    static FreewayProcess fp;

    @BeforeClass
    public static void setUp() {

        fp = new FreewayProcess(new Freeway(10));

    }

    @Test
    public void test(){

        fp.addCar(new Car(10));
        assert fp.getCars().size()==1;

    }
}
