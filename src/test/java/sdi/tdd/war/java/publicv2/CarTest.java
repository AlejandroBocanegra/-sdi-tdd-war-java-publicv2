package sdi.tdd.war.java.publicv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    //convert the javascript tests into these Java Tests----------

    @BeforeEach
    public void beforeEachTest() {
        Car car = new Car(0);
    }
    
    @Test
    @DisplayName("The car should be filled with gas")
    public void ShouldFillWithGas() {
      car.fill(0);
      assertEquals(0, car.fill());
    }
  
    @Test
    public void ShouldUseGasWhenDriving() {
      
    }
  
    @Test
    public void ShouldIncrementOdometerWhenDriving() {
     
    }
  
    @Test
    public void ShouldRecordTripsWhenDriving() {
      
    }
  
  }