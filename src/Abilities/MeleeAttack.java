/**
 * @author Ramo T
 * @since 1.6.0
 * Description: Concrete melee attack strategy. Performs a close-range slash
 *              dealing 1-6 damage. Implements the Attack interface.
 */
package Abilities;

import Monsters.Monster;
import java.util.Random;

public class MeleeAttack implements Attack {

    Random rand = new Random();

    @Override
    public Integer attack(Monster target) {
        int damage = rand.nextInt(6) + 1;
        System.out.println(target.getName() + " was hit with a melee attack for " + damage + " damage!");
        return damage;
    }

    @Override
    public String getStr() {
        return "Melee Attack";
    }
}
