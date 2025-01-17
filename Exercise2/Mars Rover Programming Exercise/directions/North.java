package directions;

import models.Position;

public class North implements Direction {
    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Direction turnRight() {
        return new East();
    }

    @Override
    public Position moveForward(Position position) {
        return new Position(position.getX(), position.getY() + 1);
    }

    @Override
    public String toString() {
        return "North";
    }
}
