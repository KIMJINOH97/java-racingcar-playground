import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(String[] carNames) {
        carList = new ArrayList<>();
        for (String car : carNames) {
            this.carList.add(new Car(car));
        }
    }

    public static List<Car> winner(List<Car> cars){
        List<Car> winCar = new ArrayList<>();
        Position maxPosition = getMaxPosition(cars);

        for (Car car : cars) {
            if (car.isWinner(maxPosition)){
                winCar.add(car);
            }
        }

        return winCar;
    }

    public static Position getMaxPosition(List<Car> cars) {
        Position maxPosition = new Position(0);

        for (Car car : cars) {
            Position pos = car.getPosition();
            if (pos.isBigger(maxPosition)){
                maxPosition = pos;
            }
        }

        return maxPosition;
    }

    public void play() {
        for (Car car : carList) {
            car.play2();
        }
    }

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carList=" + carList +
                '}';
    }
}
