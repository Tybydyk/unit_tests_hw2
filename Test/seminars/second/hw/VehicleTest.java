package seminars.second.hw;

import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
// Проверить, что объект Car создается с 4-мя колесами.
// Проверить, что объект Motorcycle создается с 2-мя колесами.
// Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
// Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
// Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
// Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup(){
        car = new Car("AutoVAZ", "VAZ-2101", 1980);
        motorcycle = new Motorcycle("Jawa moto", "Jawa 350", 1960);
    }
    @Test
    public void isCarAVehicle(){
        assertThat(car instanceof Vehicle);
    }

    @Test
    public void carHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void MotorcycleHasTwoWheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void carTestDriveSpeedIsSixty() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void motorcycleTestDriveSpeedIsSeventyFive() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void carTestDriveThenParkingSpeedIsNull() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void motorcycleTestDriveThenParkingSpeedIsNull() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}