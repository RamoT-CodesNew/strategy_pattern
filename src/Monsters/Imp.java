/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: A small, goofy melee monster. The Imp has low HP and uses
 *              randomized stats via getAttribute(). Extends Monster.
 */
package Monsters;

import Abilities.MeleeAttack;

public class Imp extends Monster {

    public Imp() {
        super("Imp", 10, 5);
        this.strength = getAttribute(1, 5);
        this.defense = getAttribute(1, 3);
        this.agility = getAttribute(3, 6);
        this.attack = new MeleeAttack();
    }

    public Imp(String name, Integer hp, Integer xp) {
        super(name, hp, xp);
        this.strength = getAttribute(1, 5);
        this.defense = getAttribute(1, 3);
        this.agility = getAttribute(3, 6);
        this.attack = new MeleeAttack();
    }
}
