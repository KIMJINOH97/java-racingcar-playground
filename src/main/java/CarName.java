public class CarName {
    private final String name;

    public CarName(String name){
        if (name.isEmpty()){
            throw new IllegalArgumentException("이름은 최소 1자이상 이어야 합니다.");
        }

        if (name.length() > 5){
            throw new IllegalArgumentException("이름은 5자이하 이어야 합니다.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

}
