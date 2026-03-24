/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: Concrete ranged attack strategy. Performs a long-range shot
 *              dealing 1-4 damage. Implements the Attack interface.
 */
package Abilities;

import Monsters.Monster;
import java.util.Random;

public class RangedAttack implements Attack {

    private static final Random rand = new Random();

    @Override
    public Integer attack(Monster target) {
        int damage = rand.nextInt(4) + 1;
        System.out.println(target.getName() + " was hit with a ranged attack for " + damage + " damage!");
        return damage;
    }

    @Override
    public String getStr() {
        return "Ranged Attack";
    }
}
