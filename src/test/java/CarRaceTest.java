import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRaceTest {

    CarRace race;

    @BeforeEach
    void init(){
        race = new CarRace(Arrays.asList("슈퍼카", "아우디", "모닝"));
    }

    @Test
    void 자동차_여러개_생성(){
        CarRace racing = new CarRace(Arrays.asList("슈퍼카", "아우디", "모닝"));
        assertThat(racing.getCars().size()).isEqualTo(3);
    }

    @Test
    void 자동차_여러개_움직이기(){
    }

}
