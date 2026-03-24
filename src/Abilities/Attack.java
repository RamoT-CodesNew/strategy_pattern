/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: Interface defining the attack strategy. Extends Ability and
 *              declares the attack behavior used by monsters in the Strategy pattern.
 *              attack() returns the damage dealt; getStr() returns the attack type name.
 */
package Abilities;

import Monsters.Monster;

public interface Attack extends Ability {
    Integer attack(Monster target);
    String getStr();
}
