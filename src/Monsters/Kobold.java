/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: Ranged monster with moderate HP and randomized stats. Extends Monster.
 */
package Monsters;

import Abilities.RangedAttack;

public class Kobold extends Monster {

    public Kobold() {
        super("Kobold", 15, 10);
        this.strength = getAttribute(3, 6);
        this.defense = getAttribute(2, 5);
        this.agility = getAttribute(2, 4);
        this.attack = new RangedAttack();
    }

    public Kobold(String name, Integer hp, Integer xp) {
        super(name, hp, xp);
        this.strength = getAttribute(3, 6);
        this.defense = getAttribute(2, 5);
        this.agility = getAttribute(2, 4);
        this.attack = new RangedAttack();
    }
}
