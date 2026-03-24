/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: A cunning ranged monster. The Kobold has moderate HP and uses
 *              randomized stats via getAttribute(). Extends Monster.
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
