package directions;

import models.Position;

public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    Position moveForward(Position position);
}
