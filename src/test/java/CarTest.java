import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 객체_생성(){
        String name = "jino";
        Car car = new Car("jino");
        assertThat(car.getName().getName()).isEqualTo(name);
    }

    @Test
    void 다섯글자_이상_에러(){
        assertThatThrownBy(()-> new Car("jinonono")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 빈_문자열_에러(){
        assertThatThrownBy(()->new Car("")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_움직이기(){
        Car car1 = new Car("jino");
        Car car2 = new Car("jino");
        car1.play(4);
        car2.play(3);
        assertThat(car1.getPosition().getPos()).isEqualTo(1);
        assertThat(car2.getPosition().getPos()).isEqualTo(0);
    }

    @Test
    void 자동차_움직이기_재정의(){
        Car car1 = new Car("jino"){
            @Override
            public int getRandomNumber(){
                return 4;
            }
        };

        Car car2 = new Car("jino"){
            @Override
            public int getRandomNumber(){
                return 3;
            }
        };

        car1.play2();
        car2.play2();
        assertThat(car1.getPosition().getPos()).isEqualTo(1);
        assertThat(car2.getPosition().getPos()).isEqualTo(0);
    }

    @Test
    public void 자동차_움직이기_함수인자(){
        Car car1 = new Car("jino");
        Car car2 = new Car("jino");
        Strategy strategy = new Strategy() {
            @Override
            public boolean check(int number) {
                return true;
            }
        };
        Strategy strategy1 = new Strategy() {
            @Override
            public boolean check(int number) {
                return false;
            }
        };

        car1.play3(strategy);
        car2.play3(strategy1);
        assertThat(car1.getPosition().getPos()).isEqualTo(1);
        assertThat(car2.getPosition().getPos()).isEqualTo(0);
    }

}
