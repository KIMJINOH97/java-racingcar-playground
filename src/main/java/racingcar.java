import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class racingcar {
    public static void main(String[] args) {
        System.out.println("자동차 이름을 인력해주세요. (,기준)");
        Scanner scanner = new Scanner(System.in);
        String nameList = scanner.nextLine();

        System.out.println("시도할 횟수를 입력해주세요: ");
        scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Race race = new Race(nameList.split(","), count);

        race.play();
        List<Car> winner = Cars.winner(race.getCars().getCarList());
        System.out.println("*****승자 출력*****");
        for (Car car : winner) {
            System.out.println("차 이름 : " + car.getName().getName() + "위치 : " + car.getPosition().getPos());
        }
    }
}
