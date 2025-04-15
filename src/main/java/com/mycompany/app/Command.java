package com.mycompany.app;

public interface Command {
    void execute(Player player, GameContext context);
}

