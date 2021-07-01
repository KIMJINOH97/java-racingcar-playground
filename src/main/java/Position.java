import java.util.Objects;

public class Position {
    private final int pos;

    public Position(int pos) {
        if (pos < 0) {
            throw new IllegalArgumentException("포지션은 음수가 될 수 없습니다.");
        }
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public boolean isBigger(Position maxPosition) {
        return this.pos > maxPosition.getPos();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return pos == position.pos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pos);
    }

}
