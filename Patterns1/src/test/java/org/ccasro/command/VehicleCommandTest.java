package org.ccasro.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VehicleCommandTest {

    private Vehicle vehicle;


    @BeforeEach
    void setup(){
        vehicle = mock(Vehicle.class);
    }

    @Test
    void startCommandShouldCallStart(){
        Command start = vehicle::start;

        start.execute();

        verify(vehicle,times(1)).start();
        verifyNoMoreInteractions(vehicle);
    }

    @Test
    void accelerateCommandShouldCallAccelerate(){
        Command accelerate = vehicle::accelerate;

        accelerate.execute();

        verify(vehicle,times(1)).accelerate();
        verifyNoMoreInteractions(vehicle);
    }

    @Test
    void brakeCommandShouldCallBrake(){
        Command brake = vehicle::brake;

        brake.execute();

        verify(vehicle,times(1)).brake();
        verifyNoMoreInteractions(vehicle);
    }

    @Test
    void controllerShouldExecuteCommand(){
        VehicleController controller = new VehicleController();

        Command command = vehicle::start;
        controller.setCommand(command);

        controller.pressButton();

        verify(vehicle).start();
    }


}
