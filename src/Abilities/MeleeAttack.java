/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: Close-range attack, deals 1-6 damage.
 */
package Abilities;

import Monsters.Monster;
import java.util.Random;

public class MeleeAttack implements Attack {

    private static final Random rand = new Random();

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
