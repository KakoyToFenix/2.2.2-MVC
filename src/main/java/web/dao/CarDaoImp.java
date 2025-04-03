package web.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {


    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", "Black", 2022));
        cars.add(new Car("Audi", "White", 2018));
        cars.add(new Car("Mercedes", "White", 2023));
        cars.add(new Car("Ford", "Blue", 2016));
        cars.add(new Car("Honda", "Red", 2002));
    }


    @Override
    public List<Car> listCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
