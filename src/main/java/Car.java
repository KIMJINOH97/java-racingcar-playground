import java.util.Random;

public class Car {
    private final int MAX_RANDOM = 9;
    final String name;
    int position;

    public Car(String name) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("적어도 1글자 이상이어야 합니다.");
        }

        if (name.length() > 5){
            throw new IllegalArgumentException("5글자 이하여야 합니다.");
        }

        this.name = name;
    }

    protected int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(MAX_RANDOM) + 1;
    }

    public void play(int number) {
        if (number >= 4){
            this.position++;
        }
    }

    public void play2(){
        int number = getRandomNumber();
        if (number >= 4){
            this.position++;
        }
    }

    public void play3(Strategy strategy){
        int number = getRandomNumber();
        if (strategy.check(number)){
            this.position++;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
