import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {
    Race race;

    @BeforeEach
    void init(){
        String str = "a,b,c";
        race = new Race(str.split(","), 5);
    }

    @Test
    void 여러개_생성(){
        assertThat(race.getCars().getCarList().size()).isEqualTo(3);
    }

    @Test
    void 자동차_경주(){
        Car car1 = new Car("a", 2);
        Car car2 = new Car("b", 2);
        Car car3 = new Car("c", 1);

        List<Car> cars = Arrays.asList(car1, car2, car3);
        assertThat(Cars.winner(cars)).contains(car1, car2);
    }
}
