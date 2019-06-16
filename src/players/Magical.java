package players;

import boss.Boss;
import game.AbilityType;

public class Magical extends Hero {

    public Magical(int health, int attack) {
        super(health, attack, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {

            int addAttack = heroes[i].getAttack();
            heroes[i].setAttack( addAttack + 10 );

        }
    }
}