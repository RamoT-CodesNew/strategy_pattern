/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: Runs the Strategy pattern demo with monsters, combat, and equals tests.
 */
import Monsters.Imp;
import Monsters.Kobold;
import Monsters.Monster;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Monster> monsters = new ArrayList<>();

        Imp imp = new Imp();
        imp.getItems().put("gold", 5);
        monsters.add(imp);

        Kobold kobold = new Kobold();
        kobold.getItems().put("arrow", 10);
        monsters.add(kobold);

        Imp namedImp = new Imp("Sneaky Imp", 12, 7);
        monsters.add(namedImp);

        System.out.println("=== Monsters ===");
        for (Monster m : monsters) {
            System.out.println(m);
        }

        System.out.println("\n=== Attack Strategies ===");
        System.out.println(imp.getName() + " uses: " + imp.getAttackStr());
        System.out.println(kobold.getName() + " uses: " + kobold.getAttackStr());

        System.out.println("\n=== Combat ===");
        imp.attackTarget(kobold);
        System.out.println(kobold);

        kobold.attackTarget(imp);
        System.out.println(imp);

        kobold.attackTarget(imp);
        System.out.println(imp);

        System.out.println("\n=== Random Attribute Rolls ===");
        System.out.println("Random roll (1-3): " + imp.getAttribute(1, 3));
        System.out.println("Random roll (1-6): " + kobold.getAttribute(1, 6));

        System.out.println("\n=== Equals Test ===");
        Imp imp2 = new Imp();
        System.out.println("imp.equals(imp): " + imp.equals(imp));
        System.out.println("imp.equals(imp2): " + imp.equals(imp2));
        System.out.println("imp.equals(kobold): " + imp.equals(kobold));
    }
}
