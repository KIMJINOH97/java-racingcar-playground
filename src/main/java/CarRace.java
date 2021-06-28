import java.util.ArrayList;
import java.util.List;

public class CarRace {
    private List<Car> cars;
    private Integer count;

    public CarRace(List<String> carNames) {
        cars = new ArrayList<>();
        carNames.forEach((name) -> cars.add(new Car(name)));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void play(){
        int i=1;
        while (count-- > 0){
            moveCar();
            System.out.println(i++ + "회 게임");
            ResultView.printCar(cars);
        }
    }

    public void moveCar(){
        for (Car car: cars){
            car.play();
        }
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
