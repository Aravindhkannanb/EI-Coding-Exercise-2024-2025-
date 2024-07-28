package models;

import directions.Direction;

public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        Position newPosition = direction.moveForward(position);
        if (grid.isWithinBounds(newPosition) && !grid.isObstacle(newPosition)) {
            position = newPosition;
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public String statusReport() {
        return "Rover is at " + position + " facing " + direction + ".";
    }
}
