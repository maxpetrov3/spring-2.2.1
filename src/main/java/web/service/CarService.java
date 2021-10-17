package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cars.add(new Car("Car" + i, "red", i * 1000));
        }
        return cars;
    }
}
