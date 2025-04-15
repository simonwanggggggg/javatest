package com.mycompany.app;

public class MoveCommand implements Command {
    private String direction;

    public MoveCommand(String direction) {
        this.direction = direction;
    }

    public void execute(Player p, GameContext c) {
        Room nextRoom = c.getCurrentRoom().getExit(direction);
        if (nextRoom != null) {
            c.setCurrentRoom(nextRoom);
            System.out.println("你移動到了：" + nextRoom.getName());
            new LookCommand().execute(p, c);
        } else {
            System.out.println("這個方向沒有路。");
        }
    }
}
