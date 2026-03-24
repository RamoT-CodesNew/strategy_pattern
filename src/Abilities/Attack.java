/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: Attack strategy interface. Returns damage dealt and attack name.
 */
package Abilities;

import Monsters.Monster;

public interface Attack extends Ability {
    Integer attack(Monster target);
    String getStr();
}
