package com.mycompany.app;

public class LookCommand implements Command {
    public void execute(Player p, GameContext c) {
        Room room = c.getCurrentRoom();
        System.out.println("【房間】：" + room.getName());
        System.out.println("【描述】：" + room.getDescription());
        Monster m = room.getMonster();
        if (m != null && m.isAlive()) {
            System.out.println("【怪物】：" + m.getName() + "（HP: " + m.getHp() + "）");
        }
        if (room.hasPotion()) {
            System.out.println("【道具】：治療藥水");
        }
        System.out.println("【可用方向】：" + room.getExitString());
    }
}
