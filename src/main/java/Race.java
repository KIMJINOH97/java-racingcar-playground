import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Race {
    final Cars cars;
    private int count;

    public Race(String[] carNames, int count) {
        cars = new Cars(carNames);
        this.count = count;
    }

    public void play(){
        while(count-- > 0) {
            cars.play();
        }
    }

    public Cars getCars() {
        return cars;
    }
}
