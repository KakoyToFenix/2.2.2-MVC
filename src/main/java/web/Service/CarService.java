package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getByCount(int count);
}
