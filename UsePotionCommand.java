package com.mycompany.app;

public class UsePotionCommand implements Command {
    public void execute(Player p, GameContext c) {
        Room room = c.getCurrentRoom();
        if (room.hasPotion()) {
            p.heal(30); // 假設回復 30 點 HP
            room.removePotion();
            System.out.println("你使用了治療藥水，HP 回復 30。你目前 HP：" + p.getHp());
        } else {
            System.out.println("這裡沒有藥水可用。");
        }
    }
}
