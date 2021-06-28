import java.util.Scanner;

public class InputView {
    public static String[] inputCar(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분). ");
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.nextLine();
        String[] carNames = carName.split(",");
        for(String name : carNames){
            if(name.length() > 5){
                throw new IllegalArgumentException("5글자 이하로 입력해야합니다.");
            }
        }
        return carNames;
    }

    public static Integer inputCount(){
        System.out.println("시도할 횟수는 몇회 입니까?");
        Scanner scanner = new Scanner(System.in);
        String count = scanner.nextLine();
        return Integer.parseInt(count);
    }
}
