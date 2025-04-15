package com.mycompany.app;

public class SkillCommand implements Command {
    private String skillName;

    public SkillCommand(String name) {
        this.skillName = name.toLowerCase();
    }

    public void execute(Player p, GameContext c) {
        Skill skill = p.getSkill(skillName);
        if (skill == null) {
            System.out.println("你沒有這個技能。");
            return;
        }
        Monster m = c.getCurrentRoom().getMonster();
        if (m != null && m.isAlive()) {
            skill.use(p, m);
            if (m.isAlive()) {
                p.takeDamage(m.getAttack());
                System.out.println(m.getName() + " 反擊你，造成 " + m.getAttack() + " 傷害！");
            } else {
                System.out.println(m.getName() + " 被你燒成灰燼了");
                p.addKill();
            }
            System.out.println("\n=== 狀態更新 ===");
            System.out.println("你的 HP：" + p.getHp());
            System.out.println(m.getName() + " HP：" + m.getHp());
        } else {
            System.out.println("這裡沒有怪物或怪物已經被擊敗。");
        }
    }
}

