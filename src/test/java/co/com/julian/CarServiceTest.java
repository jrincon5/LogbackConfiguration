package co.com.julian;

import org.junit.jupiter.api.Test;

public class CarServiceTest {

    @Test
    public void testProccess(){
        CarService carService = new CarService();
        carService.process("Input");
    }
}
