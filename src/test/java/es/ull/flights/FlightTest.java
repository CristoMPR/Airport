package es.ull.flights;

import es.ull.passengers.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FlightTest {

    @DisplayName("Pruebas del Vuelo")
    @Nested
    class FlightOneTest {
        private Flight flight;
        private Passenger passengerOne;
        private Passenger passengerTwo;

        @BeforeEach
        void setUp() {
            flight = new Flight("AA1111", 30);
            passengerOne = new Passenger("#001", "Juan", "ES");
            passengerTwo = new Passenger("#002", "Maria", "ES");
        }

        @Nested
        class TestOne {
            @DisplayName("Test número 1")
            @Test
            public void testFlightPassenger() {
                assertAll("Verificación de operaciones de un vuelo",
                        () -> assertEquals("AA1111", flight.getFlightNumber()),
                        () -> assertEquals(0, flight.getNumberOfPassengers()),
                        () -> assertEquals(true, flight.addPassenger(passengerOne)),
                        () -> assertEquals(true, flight.addPassenger(passengerTwo)),
                        () -> assertEquals(2, flight.getNumberOfPassengers()),
                        () -> assertEquals(true, flight.removePassenger(passengerOne))
                );
            }
        }
    }
}
