import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringAddTest {

    @Test
    public void nullOrEmpty(){
        Integer nullSum = StringAdder.splitAndSum(null);
        Integer emptySum = StringAdder.splitAndSum("");

        assertThat(nullSum).isEqualTo(0);
        assertThat(emptySum).isEqualTo(0);
    }

    @Test
    public void 한_숫자(){
        Integer oneSum = StringAdder.splitAndSum("1");
        assertThat(oneSum).isEqualTo(1);
    }

    @Test
    public void 쉼표로_구분(){
        Integer sumOfString = StringAdder.splitAndSum("1,2,3");
        assertThat(sumOfString).isEqualTo(6);
    }

    @Test
    public void 쉼표_및_콜론(){
        Integer sumOfString = StringAdder.splitAndSum("1,2:3");
        assertThat(sumOfString).isEqualTo(6);
    }

    @Test
    public void 커스텀_구분(){
        Integer sumOfString = StringAdder.splitAndSum("//;\n1;2;3");
        assertThat(sumOfString).isEqualTo(6);
    }

    @Test
    public void 음수(){
        assertThatThrownBy(()-> StringAdder.splitAndSum("-1,2,3")).isInstanceOf(RuntimeException.class);
    }

}
