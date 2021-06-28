import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car superCar;

    @BeforeEach
    void init(){
        superCar = new Car("슈퍼카");
    }

    @Test
    void 자동차_하나_생성(){
        String carName = "슈퍼카";
        Car car = new Car(carName);
        assertThat(car.getName()).isEqualTo(carName);
    }

    @Test
    void 자동차_랜덤넘버_생성(){
        System.out.println(superCar.makeRandomNumber());
    }

    @Test
    void 갈지_말지_결정(){
        Car superCar = new Car("슈퍼카");
        assertThat(superCar.isGo(4)).isTrue();
        assertThat(superCar.isGo(3)).isFalse();
    }

    @Test
    void 자동차_움직이기(){
        superCar.goOrStop(4);
        assertThat(superCar.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_정지(){
        superCar.goOrStop(3);
        assertThat(superCar.getPosition()).isEqualTo(0);
    }
}
