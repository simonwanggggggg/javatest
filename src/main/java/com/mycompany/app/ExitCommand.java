package com.mycompany.app;

public class ExitCommand implements Command {
    @Override
    public void execute(Player player, GameContext context) {
        System.out.println("👋 你選擇離開遊戲，掰掰！");
        System.exit(0);
    }
}