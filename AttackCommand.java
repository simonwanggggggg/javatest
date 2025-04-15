package com.mycompany.app;

public class AttackCommand implements Command {
    public void execute(Player p, GameContext c) {
        Room room = c.getCurrentRoom();
        Monster m = room.getMonster();
        if (m != null && m.isAlive()) {
            m.takeDamage(p.getAttack());
            p.addDamage(p.getAttack());
            System.out.println("你對 " + m.getName() + " 造成了 " + p.getAttack() + " 傷害！");
            if (m.isAlive()) {
                p.takeDamage(m.getAttack());
                System.out.println(m.getName() + " 反擊你，造成 " + m.getAttack() + " 傷害！");
            } else {
                System.out.println(m.getName() + " 被你擊敗了！");
                p.addKill();
                System.out.println("目前擊殺數：" + p.getKillCount());
            }
            System.out.println("\n=== 狀態更新 ===");
            System.out.println("你的 HP：" + p.getHp());
            System.out.println(m.getName() + " HP：" + m.getHp());
        } else {
            System.out.println("這裡沒有怪物或怪物已經被擊敗。");
        }
    }
}
