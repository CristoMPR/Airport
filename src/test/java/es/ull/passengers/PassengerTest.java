package es.ull.passengers;

import es.ull.passengers.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PassengerTest {

    @DisplayName("Pruebas de Pasajero")
    @Nested
    class PassengerOneTest {
        private Passenger passenger;

        @BeforeEach
        void setUp() {
            passenger = new Passenger("#003", "Manuel", "ES");
        }

        @Nested
        class TestTwo {
            @DisplayName("Prueba número 1")
            @Test
            public void testPassenger() {
                assertAll("Verificación de los atributos de un pasajero",
                        () -> assertEquals("#003", passenger.getIdentifier()),
                        () -> assertEquals("Manuel", passenger.getName()),
                        () -> assertEquals("ES", passenger.getCountryCode()),
                        () -> assertEquals("Passenger Manuel with identifier: #003 from ES", passenger.toString())
                );
            }
        }
    }
}
