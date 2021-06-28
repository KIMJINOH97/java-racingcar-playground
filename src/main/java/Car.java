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
        if (number >= MIN_GO){
            position++;
            return;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
