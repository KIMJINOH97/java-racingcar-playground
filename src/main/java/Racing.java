import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Racing {
    public static void main(String[] args) {
        String [] carNames = InputView.inputCar();
        CarRace race = new CarRace(Arrays.asList(carNames));
        race.setCount(InputView.inputCount());
        race.play();
        ResultView.printWinner(race.getCars());
    }
}
