package org.ccasro.command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        Vehicle plane = new Plane("Boeing");
        Vehicle boat = new Boat("Transatlantic");
        Vehicle bicycle = new Bicycle("Giant");

        List<Vehicle> vehicles = List.of(car,plane,boat,bicycle);
        List<Command> allCommands = new ArrayList<>();

        for (Vehicle v : vehicles){
            allCommands.add(v::start);
            allCommands.add(v::accelerate);
            allCommands.add(v::brake);
        }

        MacroCommand fullActions = new MacroCommand(allCommands);
        VehicleController controller = new VehicleController();

       controller.setCommand(fullActions);
       controller.pressButton();
    }
}
