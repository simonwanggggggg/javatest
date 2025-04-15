package com.mycompany.app;
import java.util.HashMap;
import java.util.Map;
public class Player {
    private String name;
    private int hp;
    private int attack;
    private int killCount = 0;
    private int totalDamage = 0;
    private Map<String, Skill> skills = new HashMap<>();

    public Player(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    public boolean isAlive() { return hp > 0; }
    public void takeDamage(int dmg) { hp -= dmg; }
    public int getHp() { return hp; }
    public int getAttack() { return attack; }
    public void addKill() { killCount++; }
    public void addDamage(int dmg) { totalDamage += dmg; }
    public String getName() { return name; }
    public int getKillCount() { return killCount; }
    public int getTotalDamage() { return totalDamage; }
    public void addSkill(Skill skill) {
        skills.put(skill.getName().toLowerCase(), skill);
    }

    public Skill getSkill(String name) {
        return skills.get(name.toLowerCase());
    }

    public void heal(int amount) {
        this.hp += amount;
    }

}


