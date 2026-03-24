/**
 * @author Ramo Tucakovic
 * @since 1.6.0
 * Description: Unit tests for Monster subclasses (Imp and Kobold). Tests cover
 *              default names, HP tracking, takeDamage(), getAttribute(), and equals().
 */
import Monsters.Imp;
import Monsters.Kobold;
import Monsters.Monster;

public class MonsterTest {

    public static void main(String[] args) {
        testImpDefaultName();
        testKoboldDefaultName();
        testImpDefaultHp();
        testKoboldDefaultHp();
        testTakeDamageReturnsTrueWhenAlive();
        testTakeDamageReturnsFalseWhenDead();
        testHpFloorAtZero();
        testGetAttributeInRange();
        testEqualsWithSelf();
        testEqualsWithDifferentType();
        System.out.println("All MonsterTest tests passed!");
    }

    static void testImpDefaultName() {
        Imp imp = new Imp();
        assert imp.getName().equals("Imp") : "testImpDefaultName failed";
        System.out.println("testImpDefaultName passed");
    }

    static void testKoboldDefaultName() {
        Kobold k = new Kobold();
        assert k.getName().equals("Kobold") : "testKoboldDefaultName failed";
        System.out.println("testKoboldDefaultName passed");
    }

    static void testImpDefaultHp() {
        Imp imp = new Imp();
        assert imp.getHp().equals(10) : "testImpDefaultHp failed";
        System.out.println("testImpDefaultHp passed");
    }

    static void testKoboldDefaultHp() {
        Kobold k = new Kobold();
        assert k.getHp().equals(15) : "testKoboldDefaultHp failed";
        System.out.println("testKoboldDefaultHp passed");
    }

    static void testTakeDamageReturnsTrueWhenAlive() {
        Imp imp = new Imp();
        boolean alive = imp.takeDamage(1);
        assert alive : "testTakeDamageReturnsTrueWhenAlive failed";
        System.out.println("testTakeDamageReturnsTrueWhenAlive passed");
    }

    static void testTakeDamageReturnsFalseWhenDead() {
        Imp imp = new Imp();
        boolean alive = imp.takeDamage(100);
        assert !alive : "testTakeDamageReturnsFalseWhenDead failed";
        System.out.println("testTakeDamageReturnsFalseWhenDead passed");
    }

    static void testHpFloorAtZero() {
        Imp imp = new Imp();
        imp.takeDamage(100);
        assert imp.getHp() == 0 : "testHpFloorAtZero failed";
        System.out.println("testHpFloorAtZero passed");
    }

    static void testGetAttributeInRange() {
        Imp imp = new Imp();
        for (int i = 0; i < 50; i++) {
            int val = imp.getAttribute(1, 3);
            assert val >= 1 && val <= 3 : "testGetAttributeInRange failed on value: " + val;
        }
        System.out.println("testGetAttributeInRange passed");
    }

    static void testEqualsWithSelf() {
        Imp imp = new Imp();
        assert imp.equals(imp) : "testEqualsWithSelf failed";
        System.out.println("testEqualsWithSelf passed");
    }

    static void testEqualsWithDifferentType() {
        Imp imp = new Imp();
        Kobold k = new Kobold();
        assert !imp.equals(k) : "testEqualsWithDifferentType failed";
        System.out.println("testEqualsWithDifferentType passed");
    }
}
