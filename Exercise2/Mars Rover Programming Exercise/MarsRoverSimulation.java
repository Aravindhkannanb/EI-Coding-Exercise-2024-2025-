import commands.Command;
import commands.MoveCommand;
import commands.TurnLeftCommand;
import commands.TurnRightCommand;
import directions.North;
import models.Grid;
import models.Position;
import models.Rover;

import java.util.Arrays;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        // Initialize grid and obstacles
        Grid grid = new Grid(10, 10, Arrays.asList(new Position(2, 2), new Position(3, 5)));

        // Initialize rover
        Rover rover = new Rover(new Position(0, 0), new North(), grid);

        // Define command sequence
        Command[] commands = {
            new MoveCommand(rover),
            new MoveCommand(rover),
            new TurnRightCommand(rover),
            new MoveCommand(rover),
            new TurnLeftCommand(rover),
            new MoveCommand(rover)
        };

        // Execute commands
        for (Command command : commands) {
            command.execute();
        }

        // Print status report
        System.out.println(rover.statusReport());
    }
}
