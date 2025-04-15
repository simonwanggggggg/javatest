package com.mycompany.app;

public class FireballSkill implements Skill {
    @Override
    public String getName() {
        return "fireball";
    }

    @Override
    public void use(Player player, Monster monster) {
        int damage = player.getAttack() + 25;
        monster.takeDamage(damage);
        player.addDamage(damage);
        System.out.println("🔥 你施放了【火球術】！");
        System.out.println("對 " + monster.getName() + " 造成 " + damage + " 傷害！");
    }
}
