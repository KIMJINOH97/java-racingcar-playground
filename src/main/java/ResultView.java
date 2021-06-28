import java.util.List;

public class ResultView {

    public static void printCar(List<Car> cars){
        for (Car car: cars){
            System.out.print(car.getName() + ": ");
            printPosition(car.getPosition());
            System.out.println();
        }
    }

    public static void printPosition(int position){
        for (int i=0; i<position; i++){
            System.out.print("-");
        }
    }

    public static void printWinner(List<Car> cars){
        System.out.print("우승자 : ");
        for (Car car : cars){
            if (car.getPosition() == 5){
                System.out.print(car.getName() + " ");
            }
        }
    }
}
