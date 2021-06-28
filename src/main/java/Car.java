import java.util.Random;

public class Car {
    private static int MAX_NUM = 9;
    private static int MIN_GO = 4;

    private String name;
    private int position;

    public Car(String carName) {
        this.name = carName;
    }

    public int makeRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUM);
    }

    public void play() {
        int number = makeRandomNumber();
        goOrStop(number);
    }

    public void goOrStop(int number) {
        if (isGo(number)){
            position++;
        }
    }

    public boolean isGo(int number) {
        return number >= MIN_GO;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
