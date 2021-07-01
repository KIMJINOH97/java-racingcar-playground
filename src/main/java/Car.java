import java.util.Random;

public class Car {
    private final int MAX_RANDOM = 9;
    final CarName name;
    Position position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position(0);
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new Position(position);
    }

    public boolean isWinner(Position maxPosition) {
        return position.equals(maxPosition);
    }

    protected int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(MAX_RANDOM) + 1;
    }

    public void play(int number) {
        if (number >= 4){
            position = new Position(position.getPos() + 1);
        }
    }

    public void play2(){
        int number = getRandomNumber();
        if (number >= 4){
            position = new Position(position.getPos() + 1);
        }
    }

    public void play3(Strategy strategy){
        int number = getRandomNumber();
        if (strategy.check(number)){
            position = new Position(position.getPos() + 1);
        }
    }

    public CarName getName() {
        return this.name;
    }

    public Position getPosition() {
        return position;
    }
}
