/**
 * @author Ramo T
 * @since 1.6.0
 * Description: Abstract monster class. Holds stats, items, and an Attack strategy.
 */
package Monsters;

import Abilities.Attack;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {

    private String name;
    private Integer hp;
    private Integer maxHP;
    private Integer xp;
    Integer strength;
    Integer defense;
    Integer agility;
    Attack attack;
    private HashMap<String, Integer> items;

    Random rand = new Random();

    public Monster(String name, Integer hp, Integer xp) {
        this.name = name;
        this.maxHP = hp;
        this.hp = hp;
        this.xp = xp;
        this.strength = 10;
        this.defense = 10;
        this.agility = 10;
        this.items = new HashMap<>();
    }

    // RT: returns random int between min and max inclusive
    public Integer getAttribute(Integer min, Integer max) {
        return rand.nextInt((max - min) + 1) + min;
    }

    // RT: subtracts damage from hp, returns false if perished
    public boolean takeDamage(Integer damage) {
        if (damage > 0) {
            hp -= damage;
            System.out.println("The creature was hit for " + damage + " damage");
        }
        if (hp <= 0) {
            hp = 0;
            System.out.println("Oh no! the creature has perished");
            System.out.println(this);
            return false;
        }
        return true;
    }

    public boolean attackTarget(Monster target) {
        Integer damage = attack.attack(target);
        return target.takeDamage(damage);
    }

    public String getAttackStr() {
        return attack.getStr();
    }

    public String getName() {
        return name;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getAgility() {
        return agility;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return name + " [hp=" + hp + "/" + maxHP + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster m = (Monster) o;
        return Objects.equals(name, m.name) &&
               Objects.equals(hp, m.hp) &&
               Objects.equals(maxHP, m.maxHP) &&
               Objects.equals(xp, m.xp) &&
               Objects.equals(strength, m.strength) &&
               Objects.equals(defense, m.defense) &&
               Objects.equals(agility, m.agility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, maxHP, xp, strength, defense, agility);
    }
}
