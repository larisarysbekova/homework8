package players;

import boss.Boss;
import game.AbilityType;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int attack) {
        super(health, attack, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        Random random = new Random();
        int randomNumber = random.nextInt(4 - 2) + 1;
        int currentAttack = heroes[2].getAttack();
        heroes[2].setAttack(currentAttack*randomNumber);
    }
}