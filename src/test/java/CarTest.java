import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 자동차_하나_생성(){
        String carName = "슈퍼카";
        Car superCar = new Car(carName);
        assertThat(superCar.getName()).isEqualTo(carName);
    }

    @Test
    void 자동차_여러개_생성(){
        CarRace race = new CarRace(Arrays.asList("슈퍼카", "아우디", "모닝"));
        assertThat(race.getCars().size()).isEqualTo(3);
    }

    @Test
    void 자동차_랜덤넘버_생성(){
        Car superCar = new Car("슈퍼카");
        System.out.println(superCar.makeRandomNumber());
    }

    @Test
    void 자동차_움직이기(){
        Car superCar = new Car("슈퍼카");
        superCar.play();
        assertThat(superCar.getPosition()).isEqualTo(1);
    }
}
