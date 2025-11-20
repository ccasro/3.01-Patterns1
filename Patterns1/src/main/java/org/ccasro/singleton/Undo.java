package org.ccasro.singleton;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private Undo(){}

    private static class Holder {
        private static final Undo INSTANCE = new Undo();
    }

    public static Undo getInstance() {
        return Holder.INSTANCE;
    }

    private final List<String> commands = new ArrayList<>();

    public void addCommand(String cmd){
        commands.add(cmd);
    }

    public void undo(){
        if (!commands.isEmpty()) {
            commands.removeLast();
        }
    }

    public List<String> getHistory(){
        return new ArrayList<>(commands);
    }


    public void clear(){
        commands.clear();
    }

}
