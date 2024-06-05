package racingcar.domain;

import java.util.List;

public class RacingCar {

    private final List<RacingCar> cars;

    public RacingCar(List<String> cars) {
        this.cars = generateToCars(cars);
    }

    private List<RacingCar> generateToCars(List<String> cars) {
        return cars.stream()
                .map(name -> new RacingCar(new Name(name)))
                .toList();
    }
}