package org.ccasro.command;

import java.util.List;

public class MacroCommand implements Command{

    private List<Command> commands;

    public MacroCommand(List<Command> commands){
        this.commands = commands;
    }

    @Override
    public void execute(){
        for(Command cmd : commands) {
            cmd.execute();
        }
    }
}
