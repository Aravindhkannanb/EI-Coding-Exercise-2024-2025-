package directions;

import models.Position;

public class West implements Direction {
    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Direction turnRight() {
        return new North();
    }

    @Override
    public Position moveForward(Position position) {
        return new Position(position.getX() - 1, position.getY());
    }

    @Override
    public String toString() {
        return "West";
    }
}
