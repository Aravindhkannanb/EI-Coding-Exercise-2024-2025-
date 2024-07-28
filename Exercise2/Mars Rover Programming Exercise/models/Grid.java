package models;

import java.util.List;

public class Grid {
    private int width;
    private int height;
    private List<Position> obstacles;

    public Grid(int width, int height, List<Position> obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles = obstacles;
    }

    public boolean isWithinBounds(Position position) {
        return position.getX() >= 0 && position.getX() < width && position.getY() >= 0 && position.getY() < height;
    }

    public boolean isObstacle(Position position) {
        return obstacles.contains(position);
    }
}
